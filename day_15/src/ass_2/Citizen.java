package ass_2;

public class Citizen {

    private String name;
    private String aadharNumber;
    private String mobileNumber;

    public String getdata() {
        return "Name :"+name+"\n"+"Mobile Number :"+mobileNumber+"\n"+"Aadhar Number :"+aadharNumber;
    }

    public void setdata(String name,String aadharNumber,String mobileNumber) {
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.mobileNumber = mobileNumber;
    }


}
