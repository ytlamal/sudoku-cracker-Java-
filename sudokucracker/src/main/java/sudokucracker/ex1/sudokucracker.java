package sudokucracker.ex1;

//import comp3111.webscraper.DateComparator;
//import comp3111.webscraper.Item;
//import comp3111.webscraper.LinkCell;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class sudokucracker {

    @FXML
    private Label labal1;

    @FXML
    private Button Button1;

    @FXML
    private TextField TF1;

    @FXML
    private TextField TF9;

    @FXML
    private TextField TF8;

    @FXML
    private TextField TF7;

    @FXML
    private TextField TF6;

    @FXML
    private TextField TF5;

    @FXML
    private TextField TF4;

    @FXML
    private TextField TF3;

    @FXML
    private TextField TF2;

    @FXML
    private TextField TF10;

    @FXML
    private TextField TF18;

    @FXML
    private TextField TF17;

    @FXML
    private TextField TF16;

    @FXML
    private TextField TF15;

    @FXML
    private TextField TF14;

    @FXML
    private TextField TF13;

    @FXML
    private TextField TF12;

    @FXML
    private TextField TF11;

    @FXML
    private TextField TF19;

    @FXML
    private TextField TF27;

    @FXML
    private TextField TF26;

    @FXML
    private TextField TF25;

    @FXML
    private TextField TF24;

    @FXML
    private TextField TF23;

    @FXML
    private TextField TF22;

    @FXML
    private TextField TF21;

    @FXML
    private TextField TF20;

    @FXML
    private TextField TF28;

    @FXML
    private TextField TF36;

    @FXML
    private TextField TF35;

    @FXML
    private TextField TF34;

    @FXML
    private TextField TF33;

    @FXML
    private TextField TF32;

    @FXML
    private TextField TF31;

    @FXML
    private TextField TF30;

    @FXML
    private TextField TF29;

    @FXML
    private TextField TF37;

    @FXML
    private TextField TF45;

    @FXML
    private TextField TF44;

    @FXML
    private TextField TF43;

    @FXML
    private TextField TF42;

    @FXML
    private TextField TF41;

    @FXML
    private TextField TF40;

    @FXML
    private TextField TF39;

    @FXML
    private TextField TF38;

    @FXML
    private TextField TF46;

    @FXML
    private TextField TF54;

    @FXML
    private TextField TF53;

    @FXML
    private TextField TF52;

    @FXML
    private TextField TF51;

    @FXML
    private TextField TF50;

    @FXML
    private TextField TF49;

    @FXML
    private TextField TF48;

    @FXML
    private TextField TF47;

    @FXML
    private TextField TF55;

    @FXML
    private TextField TF63;

    @FXML
    private TextField TF62;

    @FXML
    private TextField TF61;

    @FXML
    private TextField TF60;

    @FXML
    private TextField TF59;

    @FXML
    private TextField TF58;

    @FXML
    private TextField TF57;

    @FXML
    private TextField TF56;

    @FXML
    private TextField TF64;

    @FXML
    private TextField TF72;

    @FXML
    private TextField TF71;

    @FXML
    private TextField TF70;

    @FXML
    private TextField TF69;

    @FXML
    private TextField TF68;

    @FXML
    private TextField TF67;

    @FXML
    private TextField TF66;

    @FXML
    private TextField TF65;

    @FXML
    private TextField TF73;

    @FXML
    private TextField TF81;

    @FXML
    private TextField TF80;

    @FXML
    private TextField TF79;

    @FXML
    private TextField TF78;

    @FXML
    private TextField TF77;

    @FXML
    private TextField TF76;

    @FXML
    private TextField TF75;

    @FXML
    private TextField TF74;

    @FXML
    void ButtonPresssed(ActionEvent event) {
    	labal1.setText("good1");
    	
    	//testset();
    	labal1.setText("good2");
    	readsudoku();
    	//labal1.setText("good");
    	if(checksudoku(sudoku)) {
    		labal1.setText("Pass");
    		crack(sudoku);
    		labal1.setText("finished");
    		printtext();
    		labal1.setText("finished all");
    	}else {
    		labal1.setText("Not Pass");
    	}
    }
  
    @FXML
    private void initialize() {
    	testset();
    }
    public sudokucracker() {
    	
       // scraper = new WebScraper(WebScraper.ttest.No);
    } 
    public int[][] testinput=new int[][]{
		 {0,4,0,0,2,6,0,7,9},
		 {2,1,0,0,0,5,3,0,8},
		 {0,0,0,0,8,0,6,0,0},
		 {0,0,0,0,0,9,8,0,3},
		 {9,6,5,0,0,0,4,1,7},
		 {1,0,3,5,0,0,0,0,0},
		 {0,0,2,0,4,0,0,0,0},
		 {8,0,1,6,0,0,0,9,4},
		 {7,9,0,8,1,0,0,3,0},
//	 {1,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
//	 {0,0,0,0,0,0,0,0,0},
};

    public int[][] sudoku = new int[][] {
    	{1,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
   	 {0,0,0,0,0,0,0,0,0},
    };
    public TextField[][] input = new TextField[][]{
    	{TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9},
    	{TF10,TF11,TF12,TF13,TF14,TF15,TF16,TF17,TF18},
    	{TF19,TF20,TF21,TF22,TF23,TF24,TF25,TF26,TF27},
    	{TF28,TF29,TF30,TF31,TF32,TF33,TF34,TF35,TF36},
    	{TF37,TF38,TF39,TF40,TF41,TF42,TF43,TF44,TF45},
    	{TF46,TF47,TF48,TF49,TF50,TF51,TF52,TF53,TF54},
    	{TF55,TF56,TF57,TF58,TF59,TF60,TF61,TF62,TF63},
    	{TF64,TF65,TF66,TF67,TF68,TF69,TF70,TF71,TF72},
    	{TF73,TF74,TF75,TF76,TF77,TF78,TF79,TF80,TF81},
    };
    public TextField[] input1 = new TextField[]{
    	TF1,TF2,TF3,TF4,TF5,TF6,TF7,TF8,TF9,
    	TF10,TF11,TF12,TF13,TF14,TF15,TF16,TF17,TF18,
    	TF19,TF20,TF21,TF22,TF23,TF24,TF25,TF26,TF27,
    	TF28,TF29,TF30,TF31,TF32,TF33,TF34,TF35,TF36,
    	TF37,TF38,TF39,TF40,TF41,TF42,TF43,TF44,TF45,
    	TF46,TF47,TF48,TF49,TF50,TF51,TF52,TF53,TF54,
    	TF55,TF56,TF57,TF58,TF59,TF60,TF61,TF62,TF63,
    	TF64,TF65,TF66,TF67,TF68,TF69,TF70,TF71,TF72,
    	TF73,TF74,TF75,TF76,TF77,TF78,TF79,TF80,TF81,
    };
    public void testset() {
    	TF1.setText("0");TF2.setText("1");TF3.setText("0");TF4.setText("0");TF5.setText("7");TF6.setText("0");TF7.setText("0");TF8.setText("9");TF9.setText("0");
    	TF10.setText("9");TF11.setText("0");TF12.setText("2");TF13.setText("5");TF14.setText("0");TF15.setText("0");TF16.setText("8");TF17.setText("4");TF18.setText("1");
    	TF19.setText("8");TF20.setText("0");TF21.setText("3");TF22.setText("0");TF23.setText("9");TF24.setText("1");TF25.setText("0");TF26.setText("0");TF27.setText("7");
    	TF28.setText("0");TF29.setText("0");TF30.setText("8");TF31.setText("0");TF32.setText("0");TF33.setText("0");TF34.setText("0");TF35.setText("3");TF36.setText("0");
    	TF37.setText("3");TF38.setText("0");TF39.setText("0");TF40.setText("0");TF41.setText("5");TF42.setText("0");TF43.setText("0");TF44.setText("0");TF45.setText("8");
    	TF46.setText("0");TF47.setText("9");TF48.setText("0");TF49.setText("0");TF50.setText("0");TF51.setText("0");TF52.setText("2");TF53.setText("0");TF54.setText("0");
    	TF55.setText("6");TF56.setText("0");TF57.setText("0");TF58.setText("2");TF59.setText("1");TF60.setText("0");TF61.setText("7");TF62.setText("0");TF63.setText("9");
    	TF64.setText("2");TF65.setText("8");TF66.setText("7");TF67.setText("0");TF68.setText("0");TF69.setText("6");TF70.setText("1");TF71.setText("0");TF72.setText("4");
    	TF73.setText("0");TF74.setText("5");TF75.setText("0");TF76.setText("0");TF77.setText("8");TF78.setText("0");TF79.setText("0");TF80.setText("6");TF81.setText("0");
    	
    }
    public void printtext() {
    	TF1.setText(Integer.toString(sudoku[0][0]));TF2.setText(Integer.toString(sudoku[0][1]));TF3.setText(Integer.toString(sudoku[0][2]));TF4.setText(Integer.toString(sudoku[0][3]));TF5.setText(Integer.toString(sudoku[0][4]));TF6.setText(Integer.toString(sudoku[0][5]));TF7.setText(Integer.toString(sudoku[0][6]));TF8.setText(Integer.toString(sudoku[0][7]));TF9.setText(Integer.toString(sudoku[0][8]));
    	TF10.setText(Integer.toString(sudoku[1][0]));TF11.setText(Integer.toString(sudoku[1][1]));TF12.setText(Integer.toString(sudoku[1][2]));TF13.setText(Integer.toString(sudoku[1][3]));TF14.setText(Integer.toString(sudoku[1][4]));TF15.setText(Integer.toString(sudoku[1][5]));TF16.setText(Integer.toString(sudoku[1][6]));TF17.setText(Integer.toString(sudoku[1][7]));TF18.setText(Integer.toString(sudoku[1][8]));
    	TF19.setText(Integer.toString(sudoku[2][0]));TF20.setText(Integer.toString(sudoku[2][1]));TF21.setText(Integer.toString(sudoku[2][2]));TF22.setText(Integer.toString(sudoku[2][3]));TF23.setText(Integer.toString(sudoku[2][4]));TF24.setText(Integer.toString(sudoku[2][5]));TF25.setText(Integer.toString(sudoku[2][6]));TF26.setText(Integer.toString(sudoku[2][7]));TF27.setText(Integer.toString(sudoku[2][8]));
    	TF28.setText(Integer.toString(sudoku[3][0]));TF29.setText(Integer.toString(sudoku[3][1]));TF30.setText(Integer.toString(sudoku[3][2]));TF31.setText(Integer.toString(sudoku[3][3]));TF32.setText(Integer.toString(sudoku[3][4]));TF33.setText(Integer.toString(sudoku[3][5]));TF34.setText(Integer.toString(sudoku[3][6]));TF35.setText(Integer.toString(sudoku[3][7]));TF36.setText(Integer.toString(sudoku[3][8]));
    	TF37.setText(Integer.toString(sudoku[4][0]));TF38.setText(Integer.toString(sudoku[4][1]));TF39.setText(Integer.toString(sudoku[4][2]));TF40.setText(Integer.toString(sudoku[4][3]));TF41.setText(Integer.toString(sudoku[4][4]));TF42.setText(Integer.toString(sudoku[4][5]));TF43.setText(Integer.toString(sudoku[4][6]));TF44.setText(Integer.toString(sudoku[4][7]));TF45.setText(Integer.toString(sudoku[4][8]));
    	TF46.setText(Integer.toString(sudoku[5][0]));TF47.setText(Integer.toString(sudoku[5][1]));TF48.setText(Integer.toString(sudoku[5][2]));TF49.setText(Integer.toString(sudoku[5][3]));TF50.setText(Integer.toString(sudoku[5][4]));TF51.setText(Integer.toString(sudoku[5][5]));TF52.setText(Integer.toString(sudoku[5][6]));TF53.setText(Integer.toString(sudoku[5][7]));TF54.setText(Integer.toString(sudoku[5][8]));
    	TF55.setText(Integer.toString(sudoku[6][0]));TF56.setText(Integer.toString(sudoku[6][1]));TF57.setText(Integer.toString(sudoku[6][2]));TF58.setText(Integer.toString(sudoku[6][3]));TF59.setText(Integer.toString(sudoku[6][4]));TF60.setText(Integer.toString(sudoku[6][5]));TF61.setText(Integer.toString(sudoku[6][6]));TF62.setText(Integer.toString(sudoku[6][7]));TF63.setText(Integer.toString(sudoku[6][8]));
    	TF64.setText(Integer.toString(sudoku[7][0]));TF65.setText(Integer.toString(sudoku[7][1]));TF66.setText(Integer.toString(sudoku[7][2]));TF67.setText(Integer.toString(sudoku[7][3]));TF68.setText(Integer.toString(sudoku[7][4]));TF69.setText(Integer.toString(sudoku[7][5]));TF70.setText(Integer.toString(sudoku[7][6]));TF71.setText(Integer.toString(sudoku[7][7]));TF72.setText(Integer.toString(sudoku[7][8]));
    	TF73.setText(Integer.toString(sudoku[8][0]));TF74.setText(Integer.toString(sudoku[8][1]));TF75.setText(Integer.toString(sudoku[8][2]));TF76.setText(Integer.toString(sudoku[8][3]));TF77.setText(Integer.toString(sudoku[8][4]));TF78.setText(Integer.toString(sudoku[8][5]));TF79.setText(Integer.toString(sudoku[8][6]));TF80.setText(Integer.toString(sudoku[8][7]));TF81.setText(Integer.toString(sudoku[8][8]));
    	
//    	for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				input[i][j].setText(Integer.toString(sudoku[i][j]));
//				}
//		}
    }
    public int[] check=new int[] {1,2,3,4,5,6,7,8,9};
	public void readsudoku() {
		sudoku[0][0]=Integer.parseInt(TF1.getText());sudoku[0][1]=Integer.parseInt(TF2.getText());sudoku[0][2]=Integer.parseInt(TF3.getText());sudoku[0][3]=Integer.parseInt(TF4.getText());sudoku[0][4]=Integer.parseInt(TF5.getText());sudoku[0][5]=Integer.parseInt(TF6.getText());sudoku[0][6]=Integer.parseInt(TF7.getText());sudoku[0][7]=Integer.parseInt(TF8.getText());sudoku[0][8]=Integer.parseInt(TF9.getText());
		sudoku[1][0]=Integer.parseInt(TF10.getText());sudoku[1][1]=Integer.parseInt(TF11.getText());sudoku[1][2]=Integer.parseInt(TF12.getText());sudoku[1][3]=Integer.parseInt(TF13.getText());sudoku[1][4]=Integer.parseInt(TF14.getText());sudoku[1][5]=Integer.parseInt(TF15.getText());sudoku[1][6]=Integer.parseInt(TF16.getText());sudoku[1][7]=Integer.parseInt(TF17.getText());sudoku[1][8]=Integer.parseInt(TF18.getText());
		sudoku[2][0]=Integer.parseInt(TF19.getText());sudoku[2][1]=Integer.parseInt(TF20.getText());sudoku[2][2]=Integer.parseInt(TF21.getText());sudoku[2][3]=Integer.parseInt(TF22.getText());sudoku[2][4]=Integer.parseInt(TF23.getText());sudoku[2][5]=Integer.parseInt(TF24.getText());sudoku[2][6]=Integer.parseInt(TF25.getText());sudoku[2][7]=Integer.parseInt(TF26.getText());sudoku[2][8]=Integer.parseInt(TF27.getText());
		sudoku[3][0]=Integer.parseInt(TF28.getText());sudoku[3][1]=Integer.parseInt(TF29.getText());sudoku[3][2]=Integer.parseInt(TF30.getText());sudoku[3][3]=Integer.parseInt(TF31.getText());sudoku[3][4]=Integer.parseInt(TF32.getText());sudoku[3][5]=Integer.parseInt(TF33.getText());sudoku[3][6]=Integer.parseInt(TF34.getText());sudoku[3][7]=Integer.parseInt(TF35.getText());sudoku[3][8]=Integer.parseInt(TF36.getText());
		sudoku[4][0]=Integer.parseInt(TF37.getText());sudoku[4][1]=Integer.parseInt(TF38.getText());sudoku[4][2]=Integer.parseInt(TF39.getText());sudoku[4][3]=Integer.parseInt(TF40.getText());sudoku[4][4]=Integer.parseInt(TF41.getText());sudoku[4][5]=Integer.parseInt(TF42.getText());sudoku[4][6]=Integer.parseInt(TF43.getText());sudoku[4][7]=Integer.parseInt(TF44.getText());sudoku[4][8]=Integer.parseInt(TF45.getText());
		sudoku[5][0]=Integer.parseInt(TF46.getText());sudoku[5][1]=Integer.parseInt(TF47.getText());sudoku[5][2]=Integer.parseInt(TF48.getText());sudoku[5][3]=Integer.parseInt(TF49.getText());sudoku[5][4]=Integer.parseInt(TF50.getText());sudoku[5][5]=Integer.parseInt(TF51.getText());sudoku[5][6]=Integer.parseInt(TF52.getText());sudoku[5][7]=Integer.parseInt(TF53.getText());sudoku[5][8]=Integer.parseInt(TF54.getText());
		sudoku[6][0]=Integer.parseInt(TF55.getText());sudoku[6][1]=Integer.parseInt(TF56.getText());sudoku[6][2]=Integer.parseInt(TF57.getText());sudoku[6][3]=Integer.parseInt(TF58.getText());sudoku[6][4]=Integer.parseInt(TF59.getText());sudoku[6][5]=Integer.parseInt(TF60.getText());sudoku[6][6]=Integer.parseInt(TF61.getText());sudoku[6][7]=Integer.parseInt(TF62.getText());sudoku[6][8]=Integer.parseInt(TF63.getText());
		sudoku[7][0]=Integer.parseInt(TF64.getText());sudoku[7][1]=Integer.parseInt(TF65.getText());sudoku[7][2]=Integer.parseInt(TF66.getText());sudoku[7][3]=Integer.parseInt(TF67.getText());sudoku[7][4]=Integer.parseInt(TF68.getText());sudoku[7][5]=Integer.parseInt(TF69.getText());sudoku[7][6]=Integer.parseInt(TF70.getText());sudoku[7][7]=Integer.parseInt(TF71.getText());sudoku[7][8]=Integer.parseInt(TF72.getText());
		sudoku[8][0]=Integer.parseInt(TF73.getText());sudoku[8][1]=Integer.parseInt(TF74.getText());sudoku[8][2]=Integer.parseInt(TF75.getText());sudoku[8][3]=Integer.parseInt(TF76.getText());sudoku[8][4]=Integer.parseInt(TF77.getText());sudoku[8][5]=Integer.parseInt(TF78.getText());sudoku[8][6]=Integer.parseInt(TF79.getText());sudoku[8][7]=Integer.parseInt(TF80.getText());sudoku[8][8]=Integer.parseInt(TF81.getText());
    	
//		for(int i=0;i<9;i++) {
//			for(int j=0;j<9;j++) {
//				if(input[i][j]!=null) {
//				if( Integer.parseInt(input[i][j].getText())<10) {
//				sudoku[i][j]=Integer.parseInt(input[i][j].getText());
//				//System.out.println(sudoku[i][j]);
//				}
//			}
//			else{
//				sudoku[i][j]=0;
//			}
//				}
//		}
	}
	public boolean checksudoku(int[][] sudokut) {
		for(int i=0;i<9;i++) {
			int[] repeat =new int[] {0,0,0,0,0,0,0,0,0};
 			for(int j=0;j<9;j++) {
				if(sudokut[i][j]<10&&sudokut[i][j]>0) {
					repeat[sudokut[i][j]-1]++;
					if(repeat[sudokut[i][j]-1]>=2) {
						//cout<<i<<"  "<<j <<"was not pass"<<endl;
						return false;
					}
				}
			}
		}
		for(int i=0;i<9;i++) {
					int[] repeat =new int[] {0,0,0,0,0,0,0,0,0};
		 			for(int j=0;j<9;j++) {
						if(sudokut[j][i]<10&&sudokut[j][i]>0) {

							repeat[sudokut[j][i]-1]++;
							if(repeat[sudokut[j][i]-1]>=2) {
								//cout<<i<<"  "<<j <<"was not pass"<<endl;
								return false;
							}
						}
					}
				}
		//by square
		for(int i=0;i<9;i+=3) {
			for(int j=0;j<9;j+=3) {
				int[] repeat=new int[] {0,0,0,0,0,0,0,0,0};
				for(int k=0;k<3;k++) {
					for(int z=0;z<3;z++) {
						if(sudokut[i+k][j+z]<10&&sudokut[i+k][j+z]>0) {
							repeat[sudokut[i+k][j+z]-1]++;
							if(repeat[sudokut[i+k][j+z]-1]>=2) {

								//cout<<"i="<<i<<",j="<<j<<",k="<<k<<"z="<<z<<"wrong="<<i+k<<j+z<<endl;
								return false;
							}
						}
					}
				}
			}
		}
		return true ;

	}
	 void copysudoku(int[][] input,int[][] target){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					target[i][j]=input[i][j];
				}
			}
		 }
	 boolean checkfinish(int[][] sudokutemp){
		 for (int i=0;i<9;i++){
			 for(int j=0;j<9;j++){
				 if(sudokutemp[i][j]==0){
					 return false;
				 }
			 }
		 }
		 return true;
	 }
	boolean crack(int[][] temp){
		int[][] tempinput=new int[9][9];
		copysudoku(temp,tempinput);
		//base case
		if(checkfinish(tempinput)&&checksudoku(tempinput)){
			copysudoku(tempinput,sudoku);
			return true;
		}
		//recursion part
		for (int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(tempinput[i][j]==0){
						for(int k=1;k<10;k++){

							tempinput[i][j]=k;

							 if(checksudoku(tempinput)){
								 //print(tempinput);
								 crack(tempinput);
							 }
						 }
						}
					 }
				 }
		return false;
	}
}