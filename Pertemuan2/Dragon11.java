public class Dragon11 {

    int x = 5, y = 5, width = 10, height = 10;

    public Dragon11() {
        System.out.println("Selamat Datang Di Permainan Naga");
        System.out.println("=================================");
        System.out.println("Pilihan langkah");
        System.out.println("U = Atas D = Bawah\nL = Kiri R = Kanan");
        System.out.println("=================================");
        System.out.println("Posisi awal anda");
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("GAME OVER");
        System.out.println("Posisi anda melebihi batas, anda mati!");
    }

    void moveUp() {
        x += 1;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void moveDown() {
        x -= 1;
        if (x < 0 || x > width) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void moveLeft() {
        y += 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void moveRight() {
        y -= 1;
        if (y < 0 || y > height) {
            detectCollision(x, y);
        }
        System.out.println("X = " + x + "\t Y = " + y);
    }

    void tampilkanPosisi() {
        System.out.println("X = " + x + "\t Y = " + y);
    }

}