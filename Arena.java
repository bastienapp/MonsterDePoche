class Arena {

    public static void main(String[] args) {

        Monster pikachu = new Monster("Pikachu", 10, 150);
        Monster rondoudou = new Monster("Rondoudou", 20, 60);

        while (pikachu.getLife() > 0 && rondoudou.getLife() > 0) {

            pikachu.attack(rondoudou);
            if (rondoudou.getLife() > 0) {
                rondoudou.attack(pikachu);
            }
        }
    }
}