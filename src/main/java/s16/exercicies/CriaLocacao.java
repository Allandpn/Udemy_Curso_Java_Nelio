package s16.exercicies;

import s16.entities.Car;
import s16.entities.CarRent;
import s16.entities.Invoice;
import s16.services.BrasilTaxServices;
import s16.services.CarRentServices;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CriaLocacao {
    public static void main(String args[]){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String model = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:ss): ");
        String pickup_str = sc.nextLine();
        System.out.print("Return (dd/MM/yyyy hh:ss): ");
        String return_str = sc.nextLine();
        System.out.print("Enter price per hour: ");
        double pricePerHour = Double.parseDouble(sc.nextLine());
        System.out.print("Enter price per day: ");
        double pricePerDay = Double.parseDouble(sc.nextLine());

        LocalDateTime start = LocalDateTime.parse(pickup_str, formatter);
        LocalDateTime finish = LocalDateTime.parse(return_str, formatter);

        CarRent cr = new CarRent(start, finish, new Car(model));

        CarRentServices crS = new CarRentServices(pricePerHour, pricePerDay, new BrasilTaxServices());

        crS.processInvoice(cr);

        Path path = Path.of("src", "main", "java", "s16", "data", "locacao.txt");

        try {
            Files.createDirectories(path.getParent());

            try (
                BufferedWriter bw = Files.newBufferedWriter(
                        path,
                        StandardCharsets.UTF_8,
                        StandardOpenOption.CREATE,
                        StandardOpenOption.TRUNCATE_EXISTING
                )
            )
            {
                bw.write(crS.emiteRecibo(cr));
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(crS.emiteRecibo(cr));
    }
}
