package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame; 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.jdesktop.swingx.prompt.PromptSupport;

// __  __                                                
//|  \/  |                                               
//| \  / | __ _ _ __  _ __  ___                          
//| |\/| |/ _` | '_ \| '_ \/ __|                         
//| |  | | (_| | | | | | | \__ \                         
//|_|__|_|\__,_|_| |_|_| |_|___/_______ _                
//|  ____| (_)     | |   | |   |__   __(_)               
//| |__  | |_  __ _| |__ | |_     | |   _ _ __ ___   ___ 
//|  __| | | |/ _` | '_ \| __|    | |  | | '_ ` _ \ / _ \
//| |    | | | (_| | | | | |_     | |  | | | | | | |  __/
//|_|    |_|_|\__, |_| |_|\__|    |_|  |_|_| |_| |_|\___|
//            __/  |                                     
//  _____     |___/         _       _             _      
// / ____|    | |          | |     | |           | |     
//| |     __ _| | ___ _   _| | __ _| |_ ___  _ __| |     
//| |    / _` | |/ __| | | | |/ _` | __/ _ \| '__| |     
//| |___| (_| | | (__| |_| | | (_| | || (_) | |  |_|     
// \_____\__,_|_|\___|\__,_|_|\__,_|\__\___/|_|  (_)     

public class MannsFlightTimeCalculator {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			//Defined Variables.
			public JTextField departMM;
			public JTextField departDD;
			public JTextField departYY;
			public JTextField departPlace;
			public JTextField arriveDD;
			public JTextField arriveMM;
			public JTextField arriveYY;
			public JTextField arrivePlace;
			public JTextField departTime;
			public JTextField arriveTime;
			public JTextField timeDifference;
			public JButton calcButton;
			public JLabel departLabel;
			public JLabel arriveLabel;
			public JLabel blankLabel;
			private JRadioButton positiveDiff;
			private JRadioButton negativeDiff;

			
			public void run() {
				//Main Frame - JFrame
				JFrame frame = new JFrame("Mann's Flight Time Calculator");
				frame.setSize(1600, 900);
				frame.setBackground(new Color(0,191,255));
				
				//Input Panel
				JPanel inputPanel = new JPanel();
				inputPanel.setBackground(new Color(0,191,255));
				
				//resultPanel
				JPanel resultPanel = new JPanel();
				resultPanel.setBackground(new Color(0,191,255));
				resultPanel.setVisible(false);
				
				//Input Pane
				inputPanel.setLayout(new GridBagLayout());
			    GridBagConstraints inputConstraints = new GridBagConstraints();
			    
			    //Departure Inputs Label.
			    departLabel = new JLabel("\u2708 Depature Information \u2708");
			    departLabel.setFont(new Font("Dingbats",Font.BOLD, 30));
			    departLabel.setForeground(new Color(255,255,255));
			    inputConstraints.gridx = 1;
			    inputConstraints.gridy = 0;
			    inputPanel.add(departLabel, inputConstraints);
			    
			    //Departure Day Input
			    departDD = new JTextField( );
			    PromptSupport.setPrompt("Depart Date [DD]", departDD);
			    departDD.setHorizontalAlignment(JTextField.CENTER);
			    departDD.setPreferredSize(new Dimension(400, 50));
			    departDD.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    departDD.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridx = 0;
			    inputConstraints.gridy = 1;
			    inputPanel.add(departDD, inputConstraints);
			 
			    //Departure Month Input
			    departMM = new JTextField( );
			    PromptSupport.setPrompt("Depart Date [MM]", departMM);
			    departMM.setHorizontalAlignment(JTextField.CENTER);
			    departMM.setPreferredSize(new Dimension(400, 50));
			    departMM.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    departMM.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,5,10,5);
			    inputConstraints.gridx = 1;
			    inputConstraints.gridy = 1;
			    inputPanel.add(departMM, inputConstraints);
			 
			    //Departure Year Input
			    departYY = new JTextField( );
			    PromptSupport.setPrompt("Depart Date [YY]", departYY);
			    departYY.setHorizontalAlignment(JTextField.CENTER);
			    departYY.setPreferredSize(new Dimension(400, 50));
			    departYY.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    departYY.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridx = 2;
			    inputConstraints.gridy = 1;
			    inputPanel.add(departYY, inputConstraints);
			 
			    //Departure Place Input
			    departPlace = new JTextField( );
			    PromptSupport.setPrompt("Depart Place [Airport / Landing Area]", departPlace);
			    departPlace.setHorizontalAlignment(JTextField.CENTER);
			    departPlace.setPreferredSize(new Dimension(810, 50));
			    departPlace.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    departPlace.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,10);
			    inputConstraints.gridwidth = 2;
			    inputConstraints.gridx = 0;
			    inputConstraints.gridy = 2;
			    inputPanel.add(departPlace, inputConstraints);
			    
			    //Departure Time Input
			    departTime = new JTextField( );
			    PromptSupport.setPrompt("Depart Time [HH:MM]", departTime);
			    departTime.setHorizontalAlignment(JTextField.CENTER);
			    departTime.setPreferredSize(new Dimension(400, 50));
			    departTime.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    departTime.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridwidth = 1;
			    inputConstraints.gridx = 2;
			    inputConstraints.gridy = 2;
			    inputPanel.add(departTime, inputConstraints);
				
			    //##########################################################################################
			    
			    //Arrival Inputs Label
			    arriveLabel = new JLabel("\u2708 Arrival Information \u2708");
			    arriveLabel.setFont(new Font("Dingbats",Font.BOLD, 30));
			    arriveLabel.setForeground(new Color(255,255,255));
			    inputConstraints.gridx = 1;
			    inputConstraints.gridy = 3;
			    inputPanel.add(arriveLabel, inputConstraints);
			    
			    //Arrival Day Input
			    arriveDD = new JTextField( );
			    PromptSupport.setPrompt("Arrival Date [DD]", arriveDD);
			    arriveDD.setHorizontalAlignment(JTextField.CENTER);
			    arriveDD.setPreferredSize(new Dimension(400, 50));
			    arriveDD.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    arriveDD.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridx = 0;
			    inputConstraints.gridy = 4;
			    inputPanel.add(arriveDD, inputConstraints);
			 
			    //Arrival Month Input
			    arriveMM = new JTextField( );
			    PromptSupport.setPrompt("Arrival Date [MM]", arriveMM);
			    arriveMM.setHorizontalAlignment(JTextField.CENTER);
			    arriveMM.setPreferredSize(new Dimension(400, 50));
			    arriveMM.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    arriveMM.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,5,10,5);
			    inputConstraints.gridx = 1;
			    inputConstraints.gridy = 4;
			    inputPanel.add(arriveMM, inputConstraints);
			 
			    //Arrival Year Input
			    arriveYY = new JTextField( );
			    PromptSupport.setPrompt("Arrival Date [YY]", arriveYY);
			    arriveYY.setHorizontalAlignment(JTextField.CENTER);
			    arriveYY.setPreferredSize(new Dimension(400, 50));
			    arriveYY.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    arriveYY.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridx = 2;
			    inputConstraints.gridy = 4;
			    inputPanel.add(arriveYY, inputConstraints);
			 
			    //Arrival Place Input
			    arrivePlace = new JTextField( );
			    PromptSupport.setPrompt("Arrival Place [Airport / Landing Area]", arrivePlace);
			    arrivePlace.setHorizontalAlignment(JTextField.CENTER);
			    arrivePlace.setPreferredSize(new Dimension(810, 50));
			    arrivePlace.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    arrivePlace.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,10);
			    inputConstraints.gridwidth = 2;
			    inputConstraints.gridx = 0;
			    inputConstraints.gridy = 5;
			    inputPanel.add(arrivePlace, inputConstraints);
			    
			    //Arrival Time Input
			    arriveTime = new JTextField( );
			    PromptSupport.setPrompt("Arrival Time [HH:MM]", arriveTime);
			    arriveTime.setHorizontalAlignment(JTextField.CENTER);
			    arriveTime.setPreferredSize(new Dimension(400, 50));
			    arriveTime.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    arriveTime.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridwidth = 1;
			    inputConstraints.gridx = 2;
			    inputConstraints.gridy = 5;
			    inputPanel.add(arriveTime, inputConstraints);
			    
			    //######################################################################################################################
			    
			    //Time Difference Inputs Label
			    blankLabel = new JLabel("\u2708 Time Difference \u2708");
			    blankLabel.setFont(new Font("Dingbats",Font.BOLD, 30));
			    blankLabel.setForeground(new Color(255,255,255)); 
			    inputConstraints.gridx = 1;
			    inputConstraints.gridy = 6;
			    inputPanel.add(blankLabel, inputConstraints);
			    
			    //Time Difference Selection
			    //Time Difference Button Group.
			    ButtonGroup timeDiffGroup = new ButtonGroup();
			    
			    //Positive Time Difference Radio Button
			    positiveDiff = new JRadioButton("[ + ] Positive");			    
			    positiveDiff.setHorizontalAlignment(JTextField.CENTER);
			    positiveDiff.setPreferredSize(new Dimension(400, 50));
			    positiveDiff.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    positiveDiff.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,5,10,5);
			    inputConstraints.gridx = 0;
			    inputConstraints.gridy = 7;
			    inputPanel.add(positiveDiff, inputConstraints);
			    
			    //Negative Time Difference Radio Button
			    negativeDiff = new JRadioButton("[ - ] Negative");			    
			    negativeDiff.setHorizontalAlignment(JTextField.CENTER);
			    negativeDiff.setPreferredSize(new Dimension(400, 50));
			    negativeDiff.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    negativeDiff.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,5,10,5);
			    inputConstraints.gridx = 1;
			    inputConstraints.gridy = 7;
			    inputPanel.add(negativeDiff, inputConstraints);
			    
			    //Time Difference Button Group Application
			    timeDiffGroup.add(positiveDiff);
			    timeDiffGroup.add(negativeDiff);
			    
			    //Time Difference Input
			    timeDifference = new JTextField( );
			    PromptSupport.setPrompt("Time Difference [##]", timeDifference);
			    timeDifference.setHorizontalAlignment(JTextField.CENTER);
			    timeDifference.setPreferredSize(new Dimension(400, 50));
			    timeDifference.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    timeDifference.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,5,10,5);
			    inputConstraints.gridx = 2;
			    inputConstraints.gridy = 7;
			    inputPanel.add(timeDifference, inputConstraints);
			    
			    //Calculation Button
			    calcButton = new JButton("Calculate!");
			    calcButton.setPreferredSize(new Dimension(400, 50));
			    calcButton.setFont(new Font("Century Gothic",Font.PLAIN, 30));
			    calcButton.setForeground(new Color(65,105,225));
			    inputConstraints.insets = new Insets(10,0,10,0);
			    inputConstraints.gridwidth = 3;
			    inputConstraints.gridx = 0;
			    inputConstraints.gridy = 8;
			    inputPanel.add(calcButton, inputConstraints);
			    
			    
			    //Frame Compilation.
				frame.add(inputPanel, BorderLayout.CENTER);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - frame.getWidth())/2,
									  (Toolkit.getDefaultToolkit().getScreenSize().height - frame.getHeight())/2);
				frame.setResizable(false);
				frame.getRootPane().setDefaultButton(calcButton);
				//Focus on the button on start to display all SWINGX Prompt Supports.
				calcButton.requestFocus();
				
				//######################################################################################################
				
				//Calc Button Action listener.
				calcButton.addActionListener(new ActionListener() {
					//Variables
					private int departTimeCalculation;
					private int arrivalTimeCalculation;
					private int localArrivalTime;
					private int timeDifferenceCalculation;
					private int minutesCalculation;
					private int hoursCalculation;
					private JLabel resultLabelOne;
					private JLabel resultLabelTwo;
					private JButton returnButton;

					public void actionPerformed(ActionEvent arg0) {
						
						//The following STRING variable declarations are necessary to grab the user inputs from the JTextFields.
						
						//Depart Inputs.
						String departPlaceInput = departPlace.getText();
						String departDDInput = departDD.getText();
						String departMMInput = departMM.getText();
						String departYYInput = departYY.getText();
						String departTimeInput = departTime.getText();
						
						//Depart Time.
						String departSplitTime[]=departTimeInput.split(":");
						String departHours=departSplitTime[0];
						String departMinutes=departSplitTime[1];
						
						//Arrive Inputs.
						String arrivePlaceInput = arrivePlace.getText();
						String arriveDDInput = arriveDD.getText();
						String arriveMMInput = arriveMM.getText();
						String arriveYYInput = arriveYY.getText();
						String arrivalTimeInput = arriveTime.getText();
						
						//Arrival Time.
						String arrivalSplitTime[]=arrivalTimeInput.split(":");
						String arrivalHours=arrivalSplitTime[0];
						String arrivalMinutes=arrivalSplitTime[1];
						
						//Time Difference Inputs.
						String timeDifferenceInput = timeDifference.getText();
					
						
						//This System Formatting is a method I use to gather the user inputs and ensure everything is functioning perfectly.
						//It also appears more visually appealing in the console log. 
						System.out.println("Calculation Inputs:");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("|Departure Place:    | " + departPlaceInput +          "%n");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("|Departure Date:     | " + departDDInput + " / " + departMMInput + " / " + departYYInput + " at " + departHours + ":" + departMinutes + "%n");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("|Arrival Place:      | " + arrivePlaceInput +          "%n");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("+--------------------+----------------------------------%n");
						System.out.format("|Arrival Date:       | " + arriveDDInput + " / " + arriveMMInput + " / " + arriveYYInput + " at " + arrivalHours + ":" + arrivalMinutes + "%n");
						System.out.format("+--------------------+----------------------------------%n");
						
						//Toggle the Visibility of the Panels.
						inputPanel.setVisible(false);
						resultPanel.setVisible(true);
						
						//Result Panel
						resultPanel.setLayout(new GridBagLayout());
					    GridBagConstraints resultConstraints = new GridBagConstraints();
					    
						//######################################################################################################					    
					    
					    //This is where the main calculations take place.
					    
						//Departure Time Calculation Value.
						departTimeCalculation = (Integer.parseInt(departHours) * 60 + Integer.parseInt(departMinutes));
						
						//The Days. This ensures we accurately display flight time based on which day you land.
						int departDDValue = Integer.parseInt(departDDInput);
						int arriveDDValue = Integer.parseInt(arriveDDInput);
						
						//If the day you leave is greater than the day you left (I.E arriving another day).
						if(arriveDDValue > departDDValue){
							//Further Debugging through System Formatting. This adds on to the table.
							System.out.format("+--------------------+----------------------------------%n");
							System.out.format("|Day Check:          | "+"This is a Two-Day flight.     %n");
							System.out.format("+--------------------+----------------------------------%n");
							
							//Arrival Time Calculation Value.
							arrivalTimeCalculation = ((Integer.parseInt(arrivalHours) + 24)* 60 + Integer.parseInt(arrivalMinutes));
						} else {
							//Further Debugging through System Formatting. This adds on to the table.
							System.out.format("+--------------------+----------------------------------%n");
							System.out.format("|Day Check:          | "+"This is a Same-Day flight.    %n");
							System.out.format("+--------------------+----------------------------------%n");
							
							//Arrival Time Calculation Value.
							arrivalTimeCalculation = (Integer.parseInt(arrivalHours) * 60 + Integer.parseInt(arrivalMinutes));
						}
						 
						if(positiveDiff.isSelected()){
							//Further Debugging through System Formatting. This adds on to the table.
							System.out.format("+--------------------+----------------------------------%n");
							System.out.format("|Time Diff Check:    | "+"Positive Timezone             %n");
							System.out.format("+--------------------+----------------------------------%n");
							
							//The Local Arrival Time Value.
							localArrivalTime = (arrivalTimeCalculation - (Integer.parseInt(timeDifferenceInput) * 60));
						} else if(negativeDiff.isSelected()){
							//Further Debugging through System Formatting. This adds on to the table.
							System.out.format("+--------------------+----------------------------------%n");
							System.out.format("|Time Diff Check:    | "+"Negative Timezone             %n");
							System.out.format("+--------------------+----------------------------------%n");
							
							//The Local Arrival Time Value.
							localArrivalTime = (arrivalTimeCalculation + (Integer.parseInt(timeDifferenceInput) * 60));
						}
						
						//Time Difference Calculation.
						timeDifferenceCalculation = localArrivalTime - departTimeCalculation;
						
						//The Flight Time Minutes Calculation.
						minutesCalculation = timeDifferenceCalculation % 60;
						
						//The Flight Time Hours Calculation.
						hoursCalculation = (timeDifferenceCalculation - minutesCalculation) / 60;
						
						//The Result Labels.
						//There are two results to make the total Flight-Time appear bigger.
						resultLabelOne = new JLabel("The Flight From " 
												+ departPlaceInput
												+ " departing at " 
												+ departTimeInput 
												+ ", arriving at "
												+ arrivePlaceInput
												+ " by "
												+ arrivalTimeInput
												+ " will take ");
						resultLabelOne.setFont(new Font("Century Gothic",Font.BOLD, 30));
						resultLabelOne.setForeground(new Color(255,255,255));
						resultConstraints.insets = new Insets(10,0,10,0);
						resultConstraints.gridwidth = 1;
						resultConstraints.gridx = 0;
						resultConstraints.gridy = 0;
					    resultPanel.add(resultLabelOne, resultConstraints);						
						
					    //The Second Result Label.
					    resultLabelTwo = new JLabel(hoursCalculation + " Hours and " + minutesCalculation + " Minutes.");
					    resultLabelTwo.setFont(new Font("Century Gothic",Font.BOLD, 60));
					    resultLabelTwo.setForeground(new Color(255,255,255));
						resultConstraints.insets = new Insets(10,0,10,0);
						resultConstraints.gridwidth = 1;
						resultConstraints.gridx = 0;
						resultConstraints.gridy = 1;
					    resultPanel.add(resultLabelTwo, resultConstraints);	
					    
					    //Return Button.
					    returnButton = new JButton("Return!");
					    returnButton.setPreferredSize(new Dimension(400, 50));
					    returnButton.setFont(new Font("Century Gothic",Font.PLAIN, 30));
					    returnButton.setForeground(new Color(65,105,225));
					    resultConstraints.insets = new Insets(10,0,10,0);
					    resultConstraints.gridwidth = 3;
					    resultConstraints.gridx = 0;
					    resultConstraints.gridy = 2;
					    resultPanel.add(returnButton, resultConstraints);
						
					    //Return Button Action Listener.
						returnButton.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								//Rest all JTextField Inputs.
								departMM.setText("");
								departDD.setText("");
								departYY.setText("");
								departPlace.setText("");
								arriveDD.setText("");
								arriveMM.setText("");
								arriveYY.setText("");
								arrivePlace.setText("");
								departTime.setText("");
								arriveTime.setText("");
								timeDifference.setText("");
								resultLabelOne.setText("");
								resultLabelTwo.setText("");	
								
								//Return to the Input Panel.
								resultPanel.setVisible(false);
								inputPanel.setVisible(true);
								
								//Remove the Return Button.
								resultPanel.remove(returnButton);
							}
							
						});
						
						//Display Results Panel in the centre of the screen.
						frame.add(resultPanel, BorderLayout.CENTER);
					}
				});
				
				
				
			}//End of Run.
		});//End of SwingUtilitiese.
		
	}
	
}
