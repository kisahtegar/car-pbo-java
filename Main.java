import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* menciptakan Objek MPV */
        SportCar MPV = new SportCar(250, "blue");

        /* menciptakan Objek user */
        User driver = new User(MPV);

        /* status awal driver adalah OFF belum melakukan starter mobil */
        driver.StarterOffVehicle();
        
        try (/* input angka pada keyboard */
        Scanner input = new Scanner(System.in)) {
            String start;
            String colors;
            String engine;

            do{
                /* Tampilan menu utama
                 jika ketik angka 
                 1 = mesin akan dihidupkan
                 2 = mesin dimatikan
                 3 = kecepatan mobil akan di bertambah 10 ketika setiap melakukan proses ini(mesin harus dihipukan dahulu) max 350
                 4 = kecepatan mobil akan berkurang 10 ketika setiap melakukan proses ini(mesin harus dihipukan dahulu) max 40
                 5 = menampilkan keterangan move forward(mesin harus dihipukan dahulu)
                 6 = menampilkan keterangan move Backward(mesin harus dihipukan dahulu)
                 7 = menampilkan keterangan Turn Left(mesin harus dihipukan dahulu)
                 8 = menampilkan keterangan Turn Right(mesin harus dihipukan dahulu)
                 9 = menampilkan keterangan warna dan mesin
                 0 = keluar
                 */
                System.out.println("****  TEST CAR ****");
                System.out.println("[1] - Starter ON");
                System.out.println("[2] - Starter OFF");
                System.out.println("[3] - Max Speed");
                System.out.println("[4] - Min Speed");
                System.out.println("[5] - Move Forward");
                System.out.println("[6] - Move Backward");
                System.out.println("[7] - Turn Left");
                System.out.println("[8] - Turn Right");
                System.out.println("[9] - Colors And Engine");
                System.out.println("[0] - Quit");
                System.out.println("_________________________");
                System.out.print("Choose Number :");
                
                // var start memberikan inputan
                start = input.nextLine();
                
                // nilai yang diberikan dari inputan
                if(start.equalsIgnoreCase("1")){
                    driver.StarterOnVehicle();
                } else if (start.equalsIgnoreCase("2")){
                    driver.StarterOffVehicle();
                } else if (start.equalsIgnoreCase("3")){
                    driver.MaxVolSpeed();
                } else if (start.equalsIgnoreCase("4")){
                    driver.MinVolSpeed();
                } else if (start.equalsIgnoreCase("5")){
                    driver.CarMoveForward();
                } else if (start.equalsIgnoreCase("6")){
                    driver.CarMoveBackward();
                } else if (start.equalsIgnoreCase("7")){
                    driver.CarTurnLeft();
                } else if (start.equalsIgnoreCase("8")){
                    driver.CarTurnRight();
                }else if (start.equalsIgnoreCase("9")){
                    System.out.print("Choose Color :");
                    colors = input.nextLine();
                    
                    System.out.print("Choose Engine :");
                    engine = input.nextLine();

                    System.out.println("_________________________");

                    System.out.print("Colors :" + colors); 
                    System.out.print("\nEngine :" + engine);
                    
                } else if (start.equalsIgnoreCase("0")){
                    System.exit(0);
                } else {
                    System.out.println("Wrong Number.");
                }
                System.out.println("\n");
            }
            while(true);
        }

    }
}
