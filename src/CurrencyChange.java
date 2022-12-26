public class CurrencyChange {
    // Section 4 - exercice 1

    /*
    Robert souhaite échanger à la banque 1500 Euros contre des Dollars Américain au taux de 1,22 Dollars pour 1 euro.
    Créer un petit programme Java avec un main qui permette de calculer et d'afficher la valeur du montant converti en Dollars

    Vous placerez le montant initial en euros et le taux de change dans 2 variables différentes. Attention, le bureau de change n'accepte pas les centimes, vous devez venir avec un montant "rond".

    En revanche il se doit de vous rendre exactement le montant convertir, centimes compris. Vous placerez le résultat de la conversion dans une 3ème variable et vous afficherez le résultat dans la console.

    Cet exercice peut-être réalisé avec Java 8 ou Java 11 dans l'environnement de développement de votre choix.

    Instructions :

    Vous pouvez interrompre le test à tout moment et reprendre plus tard.
    Vous pouvez repasser le test autant de fois que vous le souhaitez.
    La barre de progression en haut de l'écran affiche votre progression ainsi que le temps restant pour terminer le test. Si vous manquez de temps, pas de panique : vous pourrez quand même terminer le test.
    Vous pouvez passer une question et y revenir à la fin de l'examen.
    Vous pouvez également utiliser l'option « Marquer pour vérification » pour revenir aux questions dont vous n'êtes pas certain de connaître la réponse avant d'envoyer votre test.
    Vous pouvez terminer le test et voir vos résultats immédiatement à l'aide du bouton Arrêter.
     */

    public static void main(String[] args) {

        short initialAmountInEuros = 1500;
        float rateEuroToDollar = 1.22f;

        float amountChanged = initialAmountInEuros * rateEuroToDollar;

        System.out.println(amountChanged);

    }
}
