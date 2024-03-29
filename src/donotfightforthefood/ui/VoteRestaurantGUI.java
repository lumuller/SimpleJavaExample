/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donotfightforthefood.ui;

import donotfightforthefood.dao.EmployeeDao;
import donotfightforthefood.dao.RestaurantDao;
import donotfightforthefood.dao.VotesDao;
import donotfightforthefood.models.Restaurant;
import java.util.HashMap;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 * @author Luana Müller
 */
public class VoteRestaurantGUI extends javax.swing.JFrame {
    
    private HashMap<String, Restaurant> restaurantsList;
    private HashMap<String, String> employeeList;
    private VotesDao votes;
    
    /**
     * Creates new form NewJFrame
     */
    public VoteRestaurantGUI() {
        initComponents();
        //initializing data access objects and loading the lists of employess and restaurants
        RestaurantDao restaurants = new RestaurantDao();
        restaurantsList = restaurants.loadRestaurantList();  
        
        EmployeeDao employees = new EmployeeDao();  
        employeeList = employees.loadEmployeeList();
        
        votes = new VotesDao();        
        
        //populating the list of available restaurants. Restaurants in the week's winners list will be not presented.
        String winnersOfTheWeek = votes.winnersList();  
        for(String k : restaurantsList.keySet()){            
            if(winnersOfTheWeek!= null && !winnersOfTheWeek.contains(k)){
                listRestaurants.addItem(k); 
            }        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btReturn = new javax.swing.JButton();
        txSecretID = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        listRestaurants = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txPrice = new javax.swing.JTextField();
        txTypeFood = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Vote for a restaurant, choose your option, save the lunch!");

        btReturn.setText("Return");
        btReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReturnActionPerformed(evt);
            }
        });

        jLabel2.setText("Inform your secret ID");

        listRestaurants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listRestaurantsActionPerformed(evt);
            }
        });

        jLabel3.setText("Choose a restaurant");

        txPrice.setEnabled(false);

        txTypeFood.setEnabled(false);

        jLabel4.setText("Average price (R$)");

        jLabel5.setText("Type of food");

        btSave.setText("Register my vote");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txTypeFood, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(listRestaurants, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txSecretID, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(btReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txSecretID, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listRestaurants, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txTypeFood, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReturn)
                    .addComponent(btSave))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReturnActionPerformed
        new VoteRestaurantGUI().setVisible(false);
        dispose();
    }//GEN-LAST:event_btReturnActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        
        String employeeId = String.copyValueOf(txSecretID.getPassword());
        if(employeeList.keySet().contains(employeeId)){
            if(listRestaurants.getSelectedItem()!=null){
                if(votes.addNewVote(String.copyValueOf(txSecretID.getPassword()), listRestaurants.getSelectedItem().toString())){
                    JOptionPane.showMessageDialog(rootPane, "Your vote was registered successfully. Thank you.", "Success",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "We found a problem while registering your vote. You already voted today.", "Invalid vote",ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "No restaurant option was selected. Please, choose one or register a new restaurant.", "Unidentified restaurant",ERROR_MESSAGE);
            }          
        } else {
            JOptionPane.showMessageDialog(rootPane, "The Secret ID provided is not registered yet. Please, try again or register a new Employee.", "Unidentified employee",ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btSaveActionPerformed

    private void listRestaurantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listRestaurantsActionPerformed
        String selectedRestaurant = listRestaurants.getSelectedItem().toString();
        
        Restaurant selected = restaurantsList.get(selectedRestaurant);
        txPrice.setText(""+selected.getAveragePrice());
        txTypeFood.setText(selected.getTypeOfFood());
    }//GEN-LAST:event_listRestaurantsActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btReturn;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> listRestaurants;
    private javax.swing.JTextField txPrice;
    private javax.swing.JPasswordField txSecretID;
    private javax.swing.JTextField txTypeFood;
    // End of variables declaration//GEN-END:variables
}
