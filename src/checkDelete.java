import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class checkDelete extends javax.swing.JFrame implements ActionListener,MouseListener{

    /**
     * Creates new form checkDelete
     */
    public checkDelete() {
        initComponents();
        showEmployeeFromTable();
    }

  MainClass main = new MainClass();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        id02 = new javax.swing.JTextField();
        name02 = new javax.swing.JTextField();
        gender02 = new javax.swing.JTextField();
        address02 = new javax.swing.JTextField();
        balance02 = new javax.swing.JTextField();
        position02 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        deleteEmployee = new javax.swing.JButton();
        updateEmployee = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYROLL SYSTEM");

        jPanel1.setBackground(new java.awt.Color(13, 138, 173));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("EMPLOYEE INFORMATION:-");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        jLabel3.setText("EMPLOYEE NAME:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("GENDER:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("ADDRESS:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("BALANCE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("POSITION:");

        employeeTable.setBackground(new java.awt.Color(240, 240, 240));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NAME"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        deleteEmployee.setBackground(new java.awt.Color(245, 88, 97));
        deleteEmployee.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        deleteEmployee.setForeground(new java.awt.Color(0, 0, 153));
        deleteEmployee.setText("DELETE");
        deleteEmployee.setFocusable(false);
        deleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmployeeActionPerformed(evt);
            }
        });

        updateEmployee.setBackground(new java.awt.Color(109, 234, 250));
        updateEmployee.setFont(new java.awt.Font("Tw Cen MT", 1, 10)); // NOI18N
        updateEmployee.setText("UPDATE");
        updateEmployee.setFocusable(false);
        updateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEmployeeActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(245, 88, 97));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cancel.setForeground(new java.awt.Color(0, 0, 153));
        cancel.setText("CANCEL");
        cancel.setFocusable(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\Jalb.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(position02, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(balance02)
                            .addComponent(address02)
                            .addComponent(gender02)
                            .addComponent(name02)
                            .addComponent(id02))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(updateEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(id02, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balance02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployee)
                    .addComponent(deleteEmployee)
                    .addComponent(cancel))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEmployeeActionPerformed
        try{
            String UpdateQuery = null;
            PreparedStatement ps = null;
            Connection conn = main.getConnection();
            
            UpdateQuery = "UPDATE employeedata SET employeename =? , gender =? , address =?, balance=?,employeeposition =? Where id = ?";
            ps=conn.prepareCall(UpdateQuery);
            
            ps.setString(1, name02.getText());
            ps.setString(2, gender02.getText());
            ps.setString(3, address02.getText());
            ps.setString(4, balance02.getText());
            ps.setString(5, position02.getText());
            ps.setString(6, id02.getText());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Employee Details Updated");
            showEmployeeFromTable();
        
        }catch(SQLException e){
          Logger.getLogger(checkDelete.class.getName()).log(Level.SEVERE,null,e);
        }  
    }//GEN-LAST:event_updateEmployeeActionPerformed

    private void deleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmployeeActionPerformed
        String EmployeeName = name02.getText();
        
        try{
            if(EmployeeName.equals("")){
                JOptionPane.showMessageDialog(null,"No Employee is Selected");
            }else{
                Connection conn= main.getConnection();
                Statement stmt = conn.createStatement();
                
                String sql = "DELETE FROM employeedata where employeeName = '" + EmployeeName +"'";
                String msg = "Employee was removed from the company[!] ";
                stmt.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, msg);
                showEmployeeFromTable();
            }
        }catch(SQLException e){
                String retry = "Please Try Again[!]";
                JOptionPane.showMessageDialog(null, retry);
                }
    }//GEN-LAST:event_deleteEmployeeActionPerformed

       public void showEmployeeFromTable(){
         ArrayList<EmployeeInfo> list = getEmployeeList();
         DefaultTableModel model = (DefaultTableModel) employeeTable.getModel();
         model.setRowCount(0);
         Object[]row = new Object[6];
         for (int x=0; x<list.size(); x++)
                 {
                  row[0]= list.get(x).getid();
                  row[1]= list.get(x).getName();
                  row[2]= list.get(x).getgender();
                  row[3]= list.get(x).getaddress();
                  row[4]= list.get(x).getBalance();
                  row[5]= list.get(x).getposition();
                 model.addRow(row);
                 }
                     
     }
     
     
     public void ShowItem(int index)
     {
         id02.setText(Integer.toString(getEmployeeList().get(index).getid()));
         name02.setText(getEmployeeList().get(index).getName());
         gender02.setText(getEmployeeList().get(index).getgender());
         address02.setText(getEmployeeList().get(index).getaddress());
         balance02.setText(Double.toString(getEmployeeList().get(index).getBalance()));
         position02.setText(getEmployeeList().get(index).getposition());
     }
    
    
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        new aLoginSuccessfully().setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
       int index = employeeTable.getSelectedRow();
       ShowItem(index);
    }//GEN-LAST:event_employeeTableMouseClicked
      
     public ArrayList<EmployeeInfo> getEmployeeList(){
         ArrayList<EmployeeInfo>employeelist = new ArrayList<EmployeeInfo>();
         Connection conn = main.getConnection();
         String sql = "Select * from employeedata";
         Statement stmt;
         ResultSet rs;
         try{
             stmt = conn.createStatement();
             rs = stmt.executeQuery(sql);
             EmployeeInfo employeeinfo;
             
             while(rs.next()){
                 employeeinfo = new EmployeeInfo(Integer.parseInt(rs.getString("id")),rs.getString("employeename"),rs.getString("gender"),rs.getString("address"),Double.parseDouble(rs.getString("balance")),rs.getString("employeeposition"));
                 employeelist.add(employeeinfo);
             }
         }catch(SQLException e){
             Logger.getLogger(checkDelete.class.getName()).log(Level.SEVERE,null,e);
             
      }
         return employeelist;
     }
     
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
            if("Nimbus".equals(info.getName())){
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
        }catch(ClassNotFoundException ex) {
            
            java.util.logging.Logger.getLogger(checkDelete.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                
        }catch(InstantiationException ex) {
            
            java.util.logging.Logger.getLogger(checkDelete.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                
        }catch(IllegalAccessException ex) {
            
            java.util.logging.Logger.getLogger(checkDelete.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                
        }catch(javax.swing.UnsupportedLookAndFeelException ex) {
            
            java.util.logging.Logger.getLogger(checkDelete.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                
        }

        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address02;
    private javax.swing.JTextField balance02;
    private javax.swing.JButton cancel;
    private javax.swing.JButton deleteEmployee;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField gender02;
    private javax.swing.JTextField id02;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name02;
    private javax.swing.JTextField position02;
    private javax.swing.JButton updateEmployee;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
