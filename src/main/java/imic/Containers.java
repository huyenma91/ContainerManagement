package imic;

public class Containers {
    String id;
    float chieucao;
    float chieudai;
    String type;
    boolean flag;
    String des;

    Containers(){};

    @Override
    public String toString() {
        return "Containers{" +
                "id='" + id + '\'' +
                ", chieucao=" + chieucao +
                ", chieudai=" + chieudai +
                ", type='" + type + '\'' +
                ", flag=" + flag +
                ", des='" + des + '\'' +
                '}';
    }
}
