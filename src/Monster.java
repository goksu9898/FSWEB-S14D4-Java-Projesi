    abstract class Monster implements Bleedable,Poisonable{
        @Override
        public double bleed() {
            return 0;
        }

        @Override
        public double poison() {
            return 0;
        }

        private String name;

        public Monster(String name, int hitPoints, double damage) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.damage = damage;
        }

        private int hitPoints;
    private double damage;

        public String getName() {
            return name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public double getDamage() {
            return damage;
        }
        public double attack(){
            return getDamage() + bleed() + poison();
        }
    }
