package ass_2;

public class TajHotel implements Hotel{
    @Override
    public void chickenBiryani() {
        System.out.println("Inside Taj Hotel Biryani");
    }

    @Override
    public void masalaDosa() {
        System.out.println("Inside Taj Hotel Dosa");
    }

    public void welcomeDrink(){
        System.out.println("Welcome Drink from the TajHotel");
    }
}
