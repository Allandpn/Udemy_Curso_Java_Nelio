package s13.entities;

public class OutsourcedEnployee extends Employee{
    private Double additionalCharge;

    public OutsourcedEnployee() {
        super();
    }

    public OutsourcedEnployee(String name, Integer hours, Double valuePerHourl, Double additionalCharge) {
        super(name, hours, valuePerHourl);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        return super.payment() + additionalCharge * 1.1;
    }



}
