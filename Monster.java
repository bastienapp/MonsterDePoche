class Monster {

    private String name;
    private int damage;
    private int life;

    public Monster(String name, int damage, int life) {
        this.name = name;
        this.damage = damage;
        this.life = life;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String nameValue) {
        this.name = nameValue;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damageValue) {
        this.damage = damageValue;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int lifeValue) {
        this.life = lifeValue;
    }

    public void attack(Monster opponent) {
        // qui perd des points de vie  : opponent

        // comment connaître son nombre de points de vie restant  : getLife - damage

        // comment on modifie les points de vie d'un monstre  : setLife
        int lifeRemaining = opponent.getLife() - this.getDamage(); // this.damage
        opponent.setLife(lifeRemaining);

        if (opponent.getLife() > 0) {
            // {name} has {life} points remaining.
            System.out.println(opponent.getName() + " has " + opponent.getLife() + " points remaining.");
        } else {
            // {name} is KO!
            System.out.println(opponent.getName() + " is KO!");
        }
    }
}