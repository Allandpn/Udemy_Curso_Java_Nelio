package s10.enums;

public enum WorkerLevel {
    JUNIOR(0),
    MID_LEVEL(1),
    SENIOR(2);

    private final int levelCode;

    WorkerLevel(int i) {
        this.levelCode = i;
    }

    public int getIntLevel(){
        return levelCode;
    }
}
