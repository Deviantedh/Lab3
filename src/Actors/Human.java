package Actors;
import Inter.*;
import ex.JumpException;

import java.util.*;


public class Human extends Creature  {

    private String name;
    private int id;
    private static int co = 0;
    private Set<Condition> states = new HashSet<>();
    private int j;

    public Human(String b) {
        this.id = co;
        co += 1;
        this.name = b;
    }

    public Think decide = new Think() {
        @Override
        public void doing(String a, String b) {
            System.out.println(b + Human.this.name + " решил " + a);
        }
    };

    public Think think = new Think() {
        @Override
        public void doing(String a, String b) {
            System.out.println(b + Human.this.name + " подумал " + a);
        }
    };

    public Think realise = new Think() {
        @Override
        public void doing(String a, String b) {
            System.out.println(b + Human.this.name + " понял, что " + a);
        }
    };

    public Jump jmp = new Jump(){

        @Override
        public void dojump(String a) throws JumpException {
            Random random = new Random();
            double j = random.nextDouble();
            if (j > 0.5) {
                System.out.println("У " + a + " получилось прыгнуть!");
            }
            else{
                throw new JumpException(a);

        }
        }
    };

    public Lookslike ll = new Lookslike() {
        @Override
        public void Looks(String a) {
            System.out.println(Human.this.name + " показалось, что " + a);
        }
    };

    public Think wanted = new Think() {
        @Override
        public void doing(String a, String b) {
            System.out.println(b + Human.this.name + " захотел " + a);
        }
    };
    public Feelings feels = new Feelings() {
        @Override
        public void feel(String a) {
            System.out.println(Human.this.name + " почувствовал, что " + a);
        }
    };

    public Action action = new Action() {
        @Override
        public void action(String a){
            System.out.println(Human.this.name + " " + a);
        }
    };
    public Move moves = new Move<>(){

        @Override
        public void shag() {
            System.out.println(Human.this.name + " сделал шаг.");
        }

        @Override
        public void run() {
            System.out.println(Human.this.name + " побежал.");
        }
    };

    public Change_condition cc = new Change_condition() {
        @Override
        public void addCondition(Condition newCondition) {
            states.add(newCondition);
        }

        @Override
        public void removeCondition(Condition stateToRemove) {
            states.remove(stateToRemove);
        }

        @Override
        public void clearStates() {
            states.clear();
        }

        @Override
        public Set<Condition> getStates() {
            System.out.println("Сейчас " + Human.this.name + " чувствует " + Collections.unmodifiableSet(states));
            return null;
        }

    };

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return id;
    };

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            Human a = (Human) obj;
            return this.id == a.id;
        }
    }

        @Override
        public void saw(String a) {
            System.out.println(Human.this.name + " увидел " + a);
        }

        @Override
        public void heard(String a) {
            System.out.println(Human.this.name + "услышал " + a);
        }
    }

