package s16.services;


import s16.entities.Contract;
import s16.entities.Fatura;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.text.NumberFormat;
import java.util.Locale;

public class ExportService {
    private static NumberFormat nf = NumberFormat.getCurrencyInstance(
            new Locale(
                    "pt",
                    "BR"
            ));

    public static void printContract(Contract cr){
        System.out.println("Parcelas: ");
        for(Fatura c : cr.getFaturas()){
            System.out.println(c.getDate() + " - " + nf.format(c.getTotalValue()));
        }
    }

    public static void saveFileContract(Contract cr){
        Path path = Path.of("src", "main", "java", "s16", "data", "contract.txt");

        try {
            Files.createDirectories(path.getParent());

            try (BufferedWriter bw = Files.newBufferedWriter(
                    path,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
                )
            )
            {
                for (Fatura c : cr.getFaturas()) {
                    bw.write(c.getDate() + " - " + c.getTotalValue());
                    bw.newLine();
                }

            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
