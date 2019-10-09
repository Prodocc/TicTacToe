
public class Logic {
    private final Figure[][] table;

    public Logic(Figure[][] table) {
        this.table = table;
    }

    public boolean isWinnerX() {
        //по строкам
        boolean win;
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (!(this.table[i][j].hasMarkX() && this.table[i][j].hasMarkX())) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return win;
            }
        }
        //по столбцам
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (!this.table[j][i].hasMarkX()) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return win;
            }
        }
        win = true;
        //главная диагональ
        for (int i = 0; i < 3; i++) {
            if (!this.table[i][i].hasMarkX()) {
                win = false;
                break;
            }
        }
        if (win) {
            return win;
        }
        //побочная диагональ
        int i = 0;
        int j = 2;
        while (i <= 3 && j >= 0) {
            win = true;
            if (!this.table[i][j].hasMarkX()) {
                win = false;
                break;
            }
            i++;
            j--;
        }
        if (win) {
            return win;
        }
        return false;
    }

    public boolean isWinnerO() {
        //по строкам
        boolean win = true;
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (!(this.table[i][j].hasMarkO() && this.table[i][j].hasMarkO())) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return win;
            }
        }
        //по столбцам
        for (int i = 0; i < 3; i++) {
            win = true;
            for (int j = 0; j < 3; j++) {
                if (!this.table[j][i].hasMarkO()) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return win;
            }
        }
        win = true;
        //главная диагональ
        for (int i = 0; i < 3; i++) {
            if (!this.table[i][i].hasMarkO()) {
                win = false;
                break;
            }
        }
        if (win) {
            return win;
        }
        //побочная диагональ
        int i = 0;
        int j = 2;
        while (i <= 3 && j >= 0) {
            win = true;
            if (!this.table[i][j].hasMarkO()) {
                win = false;
                break;
            }
            i++;
            j--;
        }
        if (win) {
            return win;
        }
        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!this.table[i][j].hasMarkX() && !this.table[i][j].hasMarkO()) {
                    return true;
                }
            }
        }
        return false;
    }
}
