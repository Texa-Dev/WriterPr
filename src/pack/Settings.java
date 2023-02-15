package pack;

import java.io.Serial;
import java.io.Serializable;

public class Settings implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    private String theme;
    private int x;
    private int y;

    public Settings(String theme, int x, int y) {
        this.theme = theme;
        this.x = x;
        this.y = y;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "theme='" + theme + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
