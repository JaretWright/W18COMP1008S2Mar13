package w18comp1008s2mar13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class CardViewController implements Initializable
{
    //@FXML is what links your variable name to the fx:id in the view.  For example,
    //in the view, there will be an ImageView object with the fx:id= imageView
    @FXML    private ImageView imageView;
    @FXML    private TextField faceNameTextField;
    @FXML    private TextField suitTextField;
    @FXML    private TextField faceValueTextField;
             private DeckOfCards deckOfCards;

    @FXML
    void getNextCard(ActionEvent event) {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        deckOfCards = new DeckOfCards();
        Card card = deckOfCards.dealTopCard();
        
        //get (or deal) the top card and update the view
        this.faceNameTextField.setText(card.getFaceName());
        this.faceValueTextField.setText(Integer.toString(card.getFaceValue()));
        this.suitTextField.setText(card.getSuit());
        this.imageView.setImage(card.getCardImage());
    }    
    
}
