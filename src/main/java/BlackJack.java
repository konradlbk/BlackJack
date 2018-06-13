import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {
    int counter = 0;
    int croupierCounter = 0;


    public void start() {
        Results results = new Results();
        InputHandlers inputHandlers = new InputHandlers();

        Deck deckFinal = new Deck();
        deckFinal.createDeck();

        System.out.println("Witaj w BlackJack'u!");
        System.out.println("Wciśnij 1, aby zacząć grę");
        System.out.println("Wciśnij inny klawisz, aby zakończyć");
        Scanner scanner = new Scanner(System.in);
        String input = "";

        if (scanner.nextLine().contains("1")) {
            Collections.shuffle(deckFinal.deck);
            System.out.println("Kolej pierwszego gracza");
            while (true) {
                    System.out.println("Proszę pobrać kartę(wpisz 'tak')");
                    input = scanner.nextLine();
                if (inputHandlers.isApplicable(input)==true) {

                    counter += deckFinal.deck.get(0).getValue();
                    if (deckFinal.deck.get(0).getCardNumber() == 0) {
                        System.out.println("Karta: " + deckFinal.deck.get(0).getNonNumericCards() +
                                " " + deckFinal.deck.get(0).getTypeOfCard());

                    } else {
                        System.out.println("Karta: " + "'" + deckFinal.deck.get(0).getCardNumber() + "'" +
                                " " + deckFinal.deck.get(0).getTypeOfCard());
                    }
                    System.out.println("Obecna wartość Twoich kart: " + counter);
                } else {
                    System.out.println("Nieprawidlowy znak. Wpisz 'tak' za pierwszym razem, w następnych podejściach " +
                            "używaj 'tak' lub 'nie'.");
                    continue;
                }


                for (int i = 1; i < 52; i++) {
                    results.playerLost(counter, croupierCounter);

                    System.out.println("Dołożyć kartę?");
                    input = scanner.nextLine();
                    if (inputHandlers.isApplicable(input)==true) {
                        counter += deckFinal.deck.get(i).getValue();

                        if (deckFinal.deck.get(i).getCardNumber() == 0) {
                            System.out.println("Karta: " + deckFinal.deck.get(i).getNonNumericCards() +
                                    " " + deckFinal.deck.get(i).getTypeOfCard());

                        } else {
                            System.out.println("Karta: " + "'" + deckFinal.deck.get(i).getCardNumber() + "'" +
                                    " " + deckFinal.deck.get(i).getTypeOfCard());
                        }
                        System.out.println("Obecna wartość Twoich kart: " + counter);


                    }else {
                        System.out.println("Twój wynik to: " + counter);
                        System.out.println("Teraz kolej krupiera" + "\n");


                        for (int j = i; j < 52; j++) {

                            System.out.println("Dołożyć kartę?");
                            input = scanner.nextLine();

                            if (inputHandlers.isApplicable(input)==true) {
                                croupierCounter += deckFinal.deck.get(j).getValue();
                                if (deckFinal.deck.get(j).getCardNumber() == 0) {
                                    System.out.println("Karta: " + deckFinal.deck.get(j).getNonNumericCards() +
                                            " " + deckFinal.deck.get(j).getTypeOfCard());

                                } else {
                                    System.out.println("Karta: " + "'" + deckFinal.deck.get(j).getCardNumber() +
                                           "'" + " " + deckFinal.deck.get(j).getTypeOfCard());
                                }
                                System.out.println("Obecna wartość kart krupiera: " + croupierCounter);

                            }else {
                                results.nobodyWins(counter, croupierCounter);
                                results.playerWon(counter, croupierCounter);
                                break;
                            }
                        }

                    }

                }


            }


        }


    }


}
