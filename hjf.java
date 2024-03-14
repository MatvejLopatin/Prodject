public class hjf {
    public static void main(String[] args) {
        // int peoples = 10000000;
        // int new_people = 60000;
        // for(int i = 0; i<10; i++){
        //     peoples += new_people;
        // }
        // System.out.println(peoples);

        int population = 10000000;
        int born = 14;
        int death = 8;
        int dif = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * dif / 1000;
        }
        System.out.println(population);
    }
}
