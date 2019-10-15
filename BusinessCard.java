
   import javafx.application.Application;
   import javafx.scene.canvas.GraphicsContext;
   import javafx.stage.Stage;
   import javafx.scene.paint.Color;
   import javafx.scene.text.Font; 
   import javafx.scene.text.Text; 
   import javafx.scene.shape.Line;
   import javafx.scene.image.Image;
   import javafx.scene.image.ImageView;
   import javafx.scene.Scene;
   import javafx.scene.layout.StackPane;
   import javafx.scene.effect.DropShadow;  
   import javafx.scene.effect.Shadow;  
   
 
   
   
   
   public class BusinessCard extends Application{
   
   public void start( Stage stage){
   
   GraphicsContext effect_pack = JIGraphicsUtility.setUpGraphics(stage,"Business Card", 660,400);
   
           //Favicon Icon Title in header
           //stage.getIcons().add(new Image("java.jpg"));
           //stage.show();
          
          //Background Color
           effect_pack.setFill(Color.rgb(5, 5, 5, 1));
       
           //Back Rect with black background
           effect_pack.fillRect(100,50,450,220);
           
           //three  set layer around card stars here
           effect_pack.setStroke(Color.GREEN);
           effect_pack.strokeRect(95,45,460,230);
           
           effect_pack.setStroke(Color.BLUE);
           effect_pack.strokeRect(97,47,456,226);
           
           effect_pack.setStroke(Color.PINK);
           effect_pack.strokeRect(99,49,452,222);
           //three  set layer around card ends here
           
           //Shadow effects added to background
           effect_pack.setEffect(new DropShadow(50, Color.LIGHTBLUE));
           
           //All Text in BusinessCard starts here
           effect_pack.setStroke(Color.WHITE);
           effect_pack.setFont(Font.font("Tohoma", 11)); 
           effect_pack.strokeText("Ricky McKenzie Marly", 385, 100);
           effect_pack.strokeText("Founder CEO & PLNU Student ", 385, 120);
           effect_pack.strokeText("111 Somewhere World Drive", 385, 160);
           effect_pack.strokeText("San Diego, CA, 43323", 385, 180);
           effect_pack.strokeText("(555) 555 5555", 385, 200);
           effect_pack.strokeText("fixit@homerepair.com", 385, 220);
           effect_pack.strokeText("Marly's Home Repair & Construction", 120, 208);
           //All Text in BusinessCard ends here
           
           //white line down the middle
           effect_pack.strokeLine(320,220,320,80);

           
           //roof line location starts here
           effect_pack.strokeLine(200,60,130,140);
           effect_pack.strokeLine(200,60,275,140);
           //roof line location ends here

           
           //left side (blue box)
           effect_pack.setFill(Color.BLUE);
           effect_pack.fillRect(160,110,40,40);
           
           //left side (pink box)
           effect_pack.setFill(Color.PINK);
           effect_pack.fillRect(160,155,40,40);
           
           
           //right side (yellow box)
           effect_pack.setFill(Color.YELLOW);
           effect_pack.fillRect(205,110,40,40);
           
           //right side (purple box)
           effect_pack.setFill(Color.PURPLE);
           effect_pack.fillRect(205,155,40,40);
                     

         }
         public static void main(String [] args)
         {
         
      //this causes the graphics application above to start      
      launch(args);
      }}
