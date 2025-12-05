package com.doha;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet res = null;
    ObservableList<Books> data;
    TableView<Books> table;
    public void SignIn(Stage stage) throws IOException{
        Label email = new Label("Email: ");
        Label pass = new Label("Password: ");
        TextField emailT = new TextField();
        PasswordField passT = new PasswordField();
        Button signin = new Button("Sign in");
        Button signup = new Button("Sign up");
        GridPane root = new GridPane();
        root.add(email, 0, 0);
        root.add(pass, 0, 1);
        root.add(emailT, 1, 0);
        root.add(passT, 1, 1);
        root.add(signin, 0, 2);
        root.add(signup, 1, 2);
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Scene scene = new Scene(root, 350, 400);
        scene.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        

        Alert Welcome = new Alert(Alert.AlertType.INFORMATION, "Welcome!");
        Welcome.setTitle("Signed in");
        
    signin.setOnAction(e -> {
    if (emailT.getText().equals("admin@library.com") && passT.getText().equals("admin123")) {
        Alert welcome = new Alert(Alert.AlertType.INFORMATION, "Welcome!");
        welcome.setTitle("Signed in");
        welcome.showAndWait();

        if (welcome.getResult() == ButtonType.OK) {
            try {
                Library(stage);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    } else {
        Alert error = new Alert(Alert.AlertType.ERROR, "Invalid credentials! Use:\nEmail: admin@library.com\nPassword: admin123");
        error.setTitle("Invalid");
        error.show();
    }
});

        signup.setOnAction((ActionEvent) -> {
            try {
            SignUp(stage); // Call Library method
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    });
        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();


}

        public void SignUp(Stage stage) throws IOException {
        Label nameL = new Label("Name :");
        Label passL = new Label("Password :");
        Label emailL = new Label("Email :");
        Label datel = new Label("Date of birth :");
        TextField nameK = new TextField();
        PasswordField passK = new PasswordField();
        TextField emailK = new TextField();
        Button signupK = new Button("Sign up");
        DatePicker date = new DatePicker();
        RadioButton rb1 = new RadioButton("Male ");
        RadioButton rb2 = new RadioButton("Female ");
        ToggleGroup tg = new ToggleGroup();
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);

        CheckBox cb = new CheckBox("I agree ");
        GridPane toot = new GridPane();

        toot.add(nameL, 0, 0);
        toot.add(passL, 0, 1);
        toot.add(emailL, 0, 2);
        toot.add(datel, 0, 3);
        toot.add(nameK, 1, 0);
        toot.add(passK, 1, 1);
        toot.add(emailK, 1, 2);
        toot.add(date, 1, 3);
        toot.add(rb1, 0, 4);
        toot.add(rb2, 1, 4);
        toot.add(cb, 0, 5);
        toot.add(signupK, 1, 5);
        toot.setHgap(10);
        toot.setVgap(10);
        toot.setAlignment(Pos.CENTER);


        }
        public void Library(Stage stage) throws IOException {
        
        }
    @Override
    public void start(Stage stage) throws IOException {

        Label email = new Label("Email: ");
        Label pass = new Label("Password: ");
        TextField emailT = new TextField();
        PasswordField passT = new PasswordField();
        Button signin = new Button("Sign in");
        Button signup = new Button("Sign up");

        GridPane root = new GridPane();
        root.add(email, 0, 0);
        root.add(pass, 0, 1);
        root.add(emailT, 1, 0);
        root.add(passT, 1, 1);
        root.add(signin, 0, 2);
        root.add(signup, 1, 2);
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);

        Scene scene = new Scene(root, 350, 400);
        scene.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        stage.setTitle("Welcome!");
        stage.setScene(scene);
        stage.show();

        Alert Welcome = new Alert(Alert.AlertType.INFORMATION, "Welcome!");
        Welcome.setTitle("Signed in");

        // Sign Up Form
        Label nameL = new Label("Name :");
        Label passL = new Label("Password :");
        Label emailL = new Label("Email :");
        Label datel = new Label("Date of birth :");
        TextField nameK = new TextField();
        PasswordField passK = new PasswordField();
        TextField emailK = new TextField();
        Button signupK = new Button("Sign up");
        DatePicker date = new DatePicker();
        RadioButton rb1 = new RadioButton("Male ");
        RadioButton rb2 = new RadioButton("Female ");
        ToggleGroup tg = new ToggleGroup();
        rb1.setToggleGroup(tg);
        rb2.setToggleGroup(tg);

        CheckBox cb = new CheckBox("I agree ");
        GridPane toot = new GridPane();

        toot.add(nameL, 0, 0);
        toot.add(passL, 0, 1);
        toot.add(emailL, 0, 2);
        toot.add(datel, 0, 3);
        toot.add(nameK, 1, 0);
        toot.add(passK, 1, 1);
        toot.add(emailK, 1, 2);
        toot.add(date, 1, 3);
        toot.add(rb1, 0, 4);
        toot.add(rb2, 1, 4);
        toot.add(cb, 0, 5);
        toot.add(signupK, 1, 5);
        toot.setHgap(10);
        toot.setVgap(10);
        toot.setAlignment(Pos.CENTER);

        Scene scene2 = new Scene(toot, 1200, 800);
        scene2.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        signup.setOnAction((ActionEvent) -> {
            stage.setScene(scene2);
            stage.show();
        });

        // Add Book Form
        Text txt1 = new Text("Add New Book");
        txt1.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        Label id = new Label("Id: ");
        TextField idt = new TextField();
        Label bn = new Label("Bookname: ");
        TextField bnt = new TextField();
        Label a = new Label("Author: ");
        TextField at = new TextField();
        Label g = new Label("Genre: ");
        TextField gt = new TextField();
        Label av = new Label("Availability: ");
        TextField avt = new TextField();
        Button AddBook = new Button("Add Book");
        Button select = new Button("Select");
        Button insert = new Button("Insert");
        Button delete = new Button("Delete");
        Button update = new Button("Update");
        Button back = new Button("Back");

        GridPane g3 = new GridPane();
        g3.add(txt1, 0, 0, 2, 1);
        g3.add(id, 0, 1);
        g3.add(idt, 1, 1);
        g3.add(bn, 0, 2);
        g3.add(bnt, 1, 2);
        g3.add(a, 0, 3);
        g3.add(at, 1, 3);
        g3.add(g, 0, 4);
        g3.add(gt, 1, 4);
        g3.add(av, 0, 6);
        g3.add(avt, 1, 6);
        g3.add(insert, 0, 7);
        g3.add(back, 1, 7);

        g3.setVgap(10);
        g3.setHgap(10);
        g3.setAlignment(Pos.CENTER);
        g3.setPadding(new Insets(20));

        GridPane g4 = new GridPane();
        g4.add(AddBook, 0, 0);
        g4.add(select, 1, 0);
        g4.add(delete, 2, 0);
        g4.add(update, 3, 0);
        g4.setVgap(10);
        g4.setHgap(10);
        g4.setAlignment(Pos.CENTER);
        g4.setPadding(new Insets(20));

        table = new TableView<>();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.setPlaceholder(new Label("No rows to display"));

        TableColumn<Books, Integer> c1 = new TableColumn<>("Id");
        c1.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Books, String> c2 = new TableColumn<>("BookName");
        c2.setCellValueFactory(new PropertyValueFactory<>("Bookname"));

        TableColumn<Books, String> c3 = new TableColumn<>("Author");
        c3.setCellValueFactory(new PropertyValueFactory<>("Author"));

        TableColumn<Books, String> c4 = new TableColumn<>("Genre");
        c4.setCellValueFactory(new PropertyValueFactory<>("Genre"));

        TableColumn<Books, String> c5 = new TableColumn<>("Availability");
        c5.setCellValueFactory(new PropertyValueFactory<>("Availability"));

        table.getColumns().addAll(c1, c2, c3, c4, c5);
        VBox v = new VBox(table, g4);
        v.setPadding(new Insets(20));
        Scene scene3 = new Scene(v, 800, 600);
        scene3.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        back.setOnAction((ActionEvent event) -> {
            stage.setTitle("Library Management");
            stage.setScene(scene3);
            stage.show();
        });

        try {
            show();
        } catch (Exception e) {
            System.err.println("Error loading initial data: " + e.toString());
        }

        // Sign in with default credentials: admin@library.com / admin123
        signin.setOnAction((ActionEvent) -> {
            if ((emailT.getText().equals("admin@library.com")) && passT.getText().equals("admin123")) {
                Welcome.showAndWait();

                if (Welcome.getResult().getText().equals("OK")) {
                    stage.setScene(scene3);
                    stage.setTitle("Library Management");
                    stage.show();
                }
            } else {
                Alert error = new Alert(Alert.AlertType.ERROR, "Invalid credentials! Use:\nEmail: admin@library.com\nPassword: admin123");
                error.setTitle("Invalid");
                error.show();
            }
        });

        signupK.setOnAction((ActionEvent event) -> {
            stage.setTitle("Form");

            if (nameK.getText().trim().isEmpty() || passK.getText().trim().isEmpty() || emailK.getText().trim().isEmpty()) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please fill in all required fields.");
                error.setTitle("Invalid Inputs");
                error.show();
            } else if (!cb.isSelected()) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please agree to the terms.");
                error.setTitle("Agreement Required");
                error.show();
            } else {
                Welcome.showAndWait();

                if (Welcome.getResult().getText().equals("OK")) {
                    stage.setScene(scene3);
                    stage.setTitle("Library Management");
                    stage.show();
                }
            }
        });

        Scene scene4 = new Scene(g3, 600, 500);
        scene4.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        AddBook.setOnAction((ActionEvent event) -> {
            stage.setScene(scene4);
            stage.show();
            stage.setTitle("Add Book");
        });

        insert.setOnAction((ActionEvent event) -> {
            if (idt.getText().trim().isEmpty() || bnt.getText().trim().isEmpty() ||
                    at.getText().trim().isEmpty() || gt.getText().trim().isEmpty() ||
                    avt.getText().trim().isEmpty()) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please fill in all fields.");
                error.setTitle("Invalid Input");
                error.show();
                return;
            }

            conn = dbConn.DBConnection();
            String sql = "Insert into Books (id, Bookname, Author, Genre, Availability) Values(?,?,?,?,?)";

            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, idt.getText());
                pst.setString(2, bnt.getText());
                pst.setString(3, at.getText());
                pst.setString(4, gt.getText());
                pst.setString(5, avt.getText());

                int i = pst.executeUpdate();
                if (i == 1) {
                    Alert w1 = new Alert(Alert.AlertType.INFORMATION, "Data inserted successfully");
                    w1.setTitle("Confirmation");
                    w1.showAndWait();

                    // Clear fields
                    idt.clear();
                    bnt.clear();
                    at.clear();
                    gt.clear();
                    avt.clear();
                }

                pst.close();
                conn.close();
                show();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Error inserting data: " + ex.getMessage());
                error.show();
                System.out.println(ex.toString());
            }
        });

        // Select Book Scene
        GridPane g5 = new GridPane();
        Label txt2 = new Label("Select Book");
        txt2.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        Label id2 = new Label("Id: ");
        TextField result = new TextField();
        Button select2 = new Button("Select");
        Button back2 = new Button("Back");
        Button back3 = new Button("Back");

        g5.add(txt2, 0, 0, 2, 1);
        g5.add(id2, 0, 1);
        g5.add(result, 1, 1);
        g5.add(select2, 0, 2);
        g5.add(back2, 1, 2);
        g5.setVgap(10);
        g5.setHgap(10);
        g5.setAlignment(Pos.CENTER);
        g5.setPadding(new Insets(20));
        Scene scene5 = new Scene(g5, 500, 300);
        scene5.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        select.setOnAction(e -> {
            stage.setScene(scene5);
            stage.show();
            stage.setTitle("Select Book");
        });

        select2.setOnAction(e -> {
            if (result.getText().trim().isEmpty()) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please enter a book ID.");
                error.show();
                return;
            }

            try {
                int selectedId = Integer.parseInt(result.getText());
                String sql = "SELECT * FROM Books WHERE Id = ?";

                conn = dbConn.DBConnection();
                pst = conn.prepareStatement(sql);
                pst.setInt(1, selectedId);
                res = pst.executeQuery();

                TextArea bookDetails = new TextArea();
                bookDetails.setEditable(false);
                bookDetails.setWrapText(true);

                if (res.next()) {
                    String details = String.format(
                            "Id: %d\nBook Name: %s\nAuthor: %s\nGenre: %s\nAvailability: %s",
                            res.getInt("id"),
                            res.getString("Bookname"),
                            res.getString("Author"),
                            res.getString("Genre"),
                            res.getString("Availability")
                    );
                    bookDetails.setText(details);
                } else {
                    bookDetails.setText("No books found for the given Id.");
                }

                VBox layout = new VBox(10, bookDetails, back3);
                layout.setPadding(new Insets(20));
                layout.setAlignment(Pos.CENTER);

                Scene scene6 = new Scene(layout, 600, 400);
                scene6.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());
                stage.setScene(scene6);
                stage.show();

                pst.close();
                conn.close();

            } catch (NumberFormatException ex) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please enter a valid number.");
                error.show();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Error: " + ex.getMessage());
                error.show();
                System.out.println("Error: " + ex.toString());
            }
        });

        back2.setOnAction((ActionEvent event) -> {
            stage.setTitle("Library Management");
            stage.setScene(scene3);
            stage.show();
        });

        back3.setOnAction((ActionEvent event) -> {
            stage.setTitle("Library Management");
            stage.setScene(scene3);
            stage.show();
        });

        // Delete Book Scene
        GridPane g6 = new GridPane();
        Label txt3 = new Label("Delete a Book");
        txt3.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        Label id3 = new Label("Id: ");
        TextField result2 = new TextField();
        Button delete2 = new Button("Delete");
        Button back4 = new Button("Back");

        g6.add(txt3, 0, 0, 2, 1);
        g6.add(id3, 0, 1);
        g6.add(result2, 1, 1);
        g6.add(delete2, 0, 2);
        g6.add(back4, 1, 2);
        g6.setVgap(10);
        g6.setHgap(10);
        g6.setAlignment(Pos.CENTER);
        g6.setPadding(new Insets(20));
        Scene scene6 = new Scene(g6, 500, 300);
        scene6.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        delete.setOnAction((ActionEvent event) -> {
            stage.setTitle("Delete Book");
            stage.setScene(scene6);
            stage.show();
        });

        delete2.setOnAction(e -> {
            if (result2.getText().trim().isEmpty()) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please enter a book ID.");
                error.show();
                return;
            }

            String id5 = result2.getText();
            String sql = "Delete from Books where id = ?";

            conn = dbConn.DBConnection();
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, id5);

                int i = pst.executeUpdate();
                if (i == 1) {
                    Alert w3 = new Alert(Alert.AlertType.INFORMATION, "Data deleted successfully");
                    w3.setTitle("Confirmation");
                    w3.show();
                    result2.clear();
                } else {
                    Alert error = new Alert(Alert.AlertType.ERROR, "No book found with that ID.");
                    error.show();
                }
                pst.close();
                conn.close();
                show();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Error deleting data: " + ex.getMessage());
                error.show();
                System.out.println(ex.toString());
            }
        });

        back4.setOnAction((ActionEvent event) -> {
            stage.setTitle("Library Management");
            stage.setScene(scene3);
            stage.show();
        });

        // Update Book Scene
        GridPane g7 = new GridPane();
        Label txt4 = new Label("Update Book");
        txt4.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");
        Label previd = new Label("Id: ");
        Label newbk = new Label("New Bookname: ");
        TextField result3 = new TextField();
        TextField result4 = new TextField();
        Button update2 = new Button("Update");
        Button back5 = new Button("Back");

        g7.add(txt4, 0, 0, 2, 1);
        g7.add(previd, 0, 1);
        g7.add(newbk, 0, 2);
        g7.add(result3, 1, 1);
        g7.add(result4, 1, 2);
        g7.add(update2, 0, 3);
        g7.add(back5, 1, 3);
        g7.setVgap(10);
        g7.setHgap(10);
        g7.setAlignment(Pos.CENTER);
        g7.setPadding(new Insets(20));
        Scene scene7 = new Scene(g7, 600, 400);
        scene7.getStylesheets().add(getClass().getResource("Sheet.css").toExternalForm());

        update.setOnAction((ActionEvent event) -> {
            stage.setTitle("Update Book");
            stage.setScene(scene7);
            stage.show();
        });

        update2.setOnAction((ActionEvent event) -> {
            if (result3.getText().trim().isEmpty() || result4.getText().trim().isEmpty()) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Please fill in all fields.");
                error.show();
                return;
            }

            String id7 = result3.getText();
            String m = result4.getText();

            String sql = "Update Books set Bookname = ? where Id = ?";
            conn = dbConn.DBConnection();
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, m);
                pst.setString(2, id7);
                int i = pst.executeUpdate();
                if (i == 1) {
                    Alert w3 = new Alert(Alert.AlertType.INFORMATION, "Data updated successfully");
                    w3.setTitle("Confirmation");
                    w3.show();
                    result3.clear();
                    result4.clear();
                } else {
                    Alert error = new Alert(Alert.AlertType.ERROR, "No book found with that ID.");
                    error.show();
                }
                pst.close();
                conn.close();
                show();
            } catch (Exception ex) {
                Alert error = new Alert(Alert.AlertType.ERROR, "Error updating data: " + ex.getMessage());
                error.show();
                System.out.println(ex.toString());
            }
        });

        back5.setOnAction((ActionEvent event) -> {
            stage.setTitle("Library Management");
            stage.setScene(scene3);
            stage.show();
        });

        stage.setOnCloseRequest(windowEvent -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to exit?");
            alert.setHeaderText("Confirm Exit");
            alert.showAndWait();
            if (alert.getResult().getText().equals("Cancel")) {
                windowEvent.consume();
            }
        });
    }

    public void show() throws SQLException {
        data = FXCollections.observableArrayList();
        conn = dbConn.DBConnection();

        if (conn == null) {
            System.err.println("Database connection failed!");
            return;
        }

        try {
            pst = conn.prepareStatement("select * from Books");
            res = pst.executeQuery();

            while (res.next()) {
                data.add(new Books(
                        res.getInt(1),
                        res.getString(2),
                        res.getString(3),
                        res.getString(4),
                        res.getString(5)
                ));
            }

            pst.close();
            conn.close();
            table.setItems(data);
        } catch (SQLException e) {
            System.err.println("Error loading books: " + e.getMessage());
            throw e;
        }
    }

    public static void main(String[] args) {
        launch();
    }
}