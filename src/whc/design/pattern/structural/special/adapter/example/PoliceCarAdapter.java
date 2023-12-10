package whc.design.pattern.structural.special.adapter.example;

public class PoliceCarAdapter extends CarController {

    //两个适配者类
    private PoliceSound sound;
    private PoliceLamp lamp;

    public PoliceCarAdapter() {
        sound = new PoliceSound();
        lamp = new PoliceLamp();
    }

    //发出警笛声音
    @Override
    public void phonate() {
        sound.alarmLamp();
    }

    //呈现警灯闪烁
    @Override
    public void twinkle() {
        lamp.alamSound();
    }
}


