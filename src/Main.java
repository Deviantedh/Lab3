import Actors.Human;
import Inter.Condition;
import ex.JumpException;
import ex.TermometerException;

public class Main {
    private static int k = 0;

    public static void main(String[] args) {
        //adding our objects
        Human Danny = new Human("Дэнни");
        Termometer term = new Termometer("Термометр");
        Shlang shlang = new Shlang("Шланг");
        //starting to telling a story
        Danny.action.action("обтёр губы рукой, повторяя отцовский жест.");
        Danny.moves.shag();
        shlang.looks.Looks("лежит... не двигается...");
        Danny.moves.shag();
        Danny.think.doing("про себя: «Ну, видишь, какой ты глупый? Думал про ту комнату и про дурацкую сказку о Синей Бороде и завелся, \n" +
                " а шланг, наверное, собирался свалиться уже лет пять.\n" +
                " Вот и все.»", "Смотря на шланг, ");
        Danny.think.doing("про ос", "Пристально глядя на пол, на шланг, ");
        shlang.looks.Looks(", а именно его наконечник блестел на фоне коврика.");
        Danny.think.doing(", что Шланг, будто говорит ему: «Не бойся. Я просто шланг, и все. \n" +
                "А даже если не все - то, что я с тобой сделаю, будет немного страшнее укуса пчелы или осы. \n" +
                "Что я хотел бы сделать с таким симпатичным мальчуганом... только укусить... и кусать... и кусать...»", "");
        Danny.moves.shag();
        Danny.moves.shag();
        Danny.moves.shag();
        Danny.cc.addCondition(Condition.Dryness_in_air);
        Danny.cc.getStates();
        Danny.cc.addCondition(Condition.Panic);
        Danny.cc.getStates();
        Danny.wanted.doing(", чтобы шланг зашевелился.", "Внезапно ");
        Danny.moves.shag();
        Danny.moves.shag();
        Danny.realise.doing("он уже в зоне досягаемости.", "");
        Danny.think.doing("истерически - Как он может броситься... укусить, если это всего только шланг?", "Не бросится же он на меня, - ");
        Danny.think.doing(" про ос.", "Опять ");
        //adding Termometrexception
        try {
            term.changetemp();
        } catch (TermometerException e) {
            System.out.println(e + " Кажется что то пошло не так... \n" +
                    "Температура недостаточно низко опустилась\n" +
                    ""
            );
            k = k + 1; // our counter
        }
        Danny.cc.clearStates();
        Danny.cc.addCondition(Condition.Numb);
        Danny.cc.getStates();
        Danny.action.action(", словно зачарованный, не сводил глаз с чёрного отверстия в центре наконечника.");
        Danny.think.doing("про ос, чьи коричневые тельца возможно переполнены ядом лично для него...", "И снова ");
        Danny.cc.removeCondition(Condition.Numb);
        Danny.cc.addCondition(Condition.Scared);
        Danny.cc.getStates();
        Danny.realise.doing("оцепенел от ужаса, и если он не пойдёт, то останется там навечно смотреть на наконечник страшного шланга...\n" +
                "Как птица смотрит на змею.","Вдруг ");
        Danny.think.doing("и решился побежать.", "Испугавшись, что он будет здесь пока его не найдёт папа");
        Danny.action.action("тоненько застонал и собрался с силами.");
        Danny.moves.run();
        Danny.ll.Looks(", когда он уже поравнялся со шлангом, его наконечник вертелся, шевелился, \n" +
                "будто сейчас его ударит");
        //adding Jumpexcption
        try {
            Danny.jmp.dojump(Danny.getName());
        } catch (JumpException e){
            System.out.println(e + " не смог прыгнуть...");
            k = k + 1;
        }
        Danny.action.action("приземлился по другую сторону шланга");
        Danny.cc.addCondition(Condition.Panic);
        Danny.cc.getStates();
        Danny.ll.Looks("он подпрыгнул под самый потолок, а его жёсткий чубчик мазнул штукатурку потолка.");
        Danny.realise.doing("такого быть не могло...", "Позже ");



    }

}