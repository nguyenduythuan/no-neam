/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat.nhom1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import org.codehaus.jackson.map.ObjectMapper;


/**
 *
 * @author ADMIN
 */


public class chatFrame extends javax.swing.JFrame {
    /**
     * Creates new form ChatFrame
     */
    public static int t;
    public static String USER;
    final private DefaultListModel<String> friendList;
    final private HashMap<String,String> mapChatContent;
    public chatFrame() {
        friendList = new DefaultListModel<>();
        mapChatContent = new HashMap<>();
        initComponents();
        dsfriends.setModel(friendList);
        USER = loginFrame.USER_NAME;
        lblchu.setText(USER);
        getUser();         
        GetMessage g = new GetMessage();
        g.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dsfriends = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        noidung = new javax.swing.JTextArea();
        txt_Noidung = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblkhach = new javax.swing.JLabel();
        lblchu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        dsfriends.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        dsfriends.setForeground(new java.awt.Color(51, 51, 255));
        dsfriends.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        dsfriends.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                dsfriendsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(dsfriends);

        noidung.setEditable(false);
        noidung.setBackground(new java.awt.Color(204, 255, 255));
        noidung.setColumns(20);
        noidung.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        noidung.setRows(5);
        jScrollPane2.setViewportView(noidung);

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        btout.setBackground(new java.awt.Color(255, 0, 0));
        btout.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btout.setForeground(new java.awt.Color(255, 255, 255));
        btout.setText("Logout");
        btout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btoutMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("MY CHAT");

        lblkhach.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblkhach.setForeground(new java.awt.Color(0, 0, 255));
        lblkhach.setIcon(new javax.swing.ImageIcon("C:\\Users\\thuan\\Documents\\NetBeansProjects\\Chat(Nhom1)\\test\\online.png")); // NOI18N
        lblkhach.setText("UserName ");

        lblchu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblchu.setForeground(new java.awt.Color(0, 204, 0));
        lblchu.setIcon(new javax.swing.ImageIcon("C:\\Users\\thuan\\Documents\\NetBeansProjects\\Chat(Nhom1)\\test\\admin.png")); // NOI18N
        lblchu.setText("Admin");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\thuan\\Documents\\NetBeansProjects\\Chat(Nhom1)\\test\\iconChat.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 24, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txt_Noidung))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(327, 327, 327)))
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblchu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btout)
                                            .addComponent(lblchu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Noidung, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String s = txt_Noidung.getText().trim();
        if (s.length() >0){
            try{
                Message m = new Message();
                m.sender = USER;
                m.receiver = lblkhach.getText().trim();
                m.type = "chat";
                m.content = s;
                Client client = new Client();
                Message r = client.sendMessage(m);
                if (r.content.equalsIgnoreCase("ok")){
                   noidung.append("Tôi : " + s + "\n");
                    txt_Noidung.setText("");
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dsfriendsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_dsfriendsValueChanged

        String s = lblkhach.getText();
        String content = noidung.getText();
        mapChatContent.put(s, content);
        if (!evt.getValueIsAdjusting()){
            JList source = (JList)evt.getSource();
            String selected = source.getSelectedValue().toString();
            lblkhach.setText(selected);
            content = mapChatContent.get(selected);
            noidung.setText(content);
        }
    }//GEN-LAST:event_dsfriendsValueChanged

    
    
    private void btoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btoutMouseClicked
        // TODO add your handling code here:
       
        chatFrame cf = new chatFrame();
        JOptionPane.showMessageDialog(cf, "Bạn đã đăng xuất");
        loginFrame LF = new loginFrame();
        LF.setVisible(true);
        this.setVisible(false);
       
        
    
    }//GEN-LAST:event_btoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(chatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatFrame().setVisible(true);                               
            }                                
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btout;
    private javax.swing.JList<String> dsfriends;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel lblchu;
    public javax.swing.JLabel lblkhach;
    private javax.swing.JTextArea noidung;
    private javax.swing.JTextField txt_Noidung;
    // End of variables declaration//GEN-END:variables
private void getUser(){
    
          try{
           
            Message m = new Message();
            m.sender = USER;
            m.receiver = "server";
            m.type = "getusers";
            Client client = new Client();
            Message r = client.sendMessage(m);
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<String> b = mapper.readValue(r.content, ArrayList.class);
            for (int i=0; i<b.size(); i++){
                String s = b.get(i);
                System.out.println(""+s);
                friendList.addElement(s);
                mapChatContent.put(s, "");
                if (i==0){
                    lblkhach.setText(s);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public class GetMessage extends Thread
    {
        public void run()
        {
            try {
                
                
                while(true){
                    Message m = new Message();
                    m.sender = USER;
                    m.receiver = "server";
                    m.type = "getmessages";
                    m.content = lblkhach.getText().trim();
                    Client client = new Client();
                    Message r;// = client.sendMessage(m);
                    ObjectMapper mapper;// = new ObjectMapper();
                    ArrayList<String> b;
                    Thread.sleep(3000);
                    r = client.sendMessage(m);
                    mapper = new ObjectMapper();
                    b = null;
                    b = mapper.readValue(r.content, ArrayList.class);
                    for (String c:b){
                        
                        noidung.append(m.content+": " + c + "\n");
                    }

                }
            }
            catch (Exception e) {
                
            }
        }
    }

}



