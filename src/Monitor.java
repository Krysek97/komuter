public class Monitor {
    private int width = 2160;
    private int length = 3840;

    public void setLowResolution(){
        width = 1080;
        length = 1920;
        System.out.println("Resolution is set to low");
    }

    public void setHighResolution(){
        width = 2160;
        length = 3840;
        System.out.println("Resolution is set to high");
    }

    public String getResolution (){
        return length + "x" + width;
    }


}
