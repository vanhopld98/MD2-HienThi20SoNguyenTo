public class Main {
    public static void main(String[] args) {
        int prmie = 3;
        int count = 0;
        boolean flag = false;
        System.out.println("Hiển thị 20 số nguyên tố");
        while (count < 20) {
            for (int i = 2; i < prmie; i++) {
                if (prmie % i == 0) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag == true) {
                count++;
                System.out.print(prmie+" , ");
            }
            prmie++;
        }
    }
}