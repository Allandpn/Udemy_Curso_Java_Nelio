package s14.entities;

import s14.exceptions.DomainException;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private int roomNumber;
    private LocalDate chekin;
    private LocalDate chekout;

    private static DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(int roomNumber, String chekin, String chekout) throws DomainException{
        this.roomNumber = roomNumber;
        fazerReservas(chekin, chekout);
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getChekin() {
        return chekin;
    }

    public LocalDate getChekout() {
        return chekout;
    }

    public long duration(){
        return Duration.between(chekin.atStartOfDay(), chekout.atStartOfDay()).toDays();
    }

    public void fazerReservas(String in, String out) throws DomainException{
        LocalDate chekin = LocalDate.parse(in, df);
        LocalDate chekout = LocalDate.parse(out, df);
        if(verificaDatas(chekin, chekout)){
            this.chekin = chekin;
            this.chekout = chekout;
            return;
        }
        throw new DomainException("As datas informadas estao invalidas");
    }

    public void updateDates(String in, String out) throws DomainException{
        LocalDate chekin = LocalDate.parse(in, df);
        LocalDate chekout = LocalDate.parse(out, df);
        if(verificaDatas(chekin, chekout)){
            if(chekin.isAfter(this.chekin) && chekout.isAfter(this.chekout)){
                this.chekin = chekin;
                this.chekout = chekout;
                return;
            } else {
                throw new DomainException("As novas datas devem ser posteriores as datas salvas");
            }
        }
        throw new DomainException("As datas informadas estao invalidas");
    }

    private boolean verificaDatas(LocalDate chekin, LocalDate chekout){
        if(chekout.isAfter(chekin)){
            LocalDate now = LocalDate.now();
            if(chekin.isEqual(now) || chekin.isAfter(now)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.append("Room ")
                .append(roomNumber)
                .append(", check-in: ")
                .append(df.format(chekin))
                .append(", check-out: ")
                .append(df.format(chekout))
                .append(", ")
                .append(duration())
                .append(" nights")
                .toString();
    }
}
