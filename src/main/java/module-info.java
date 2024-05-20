module com.jojodu.book.intellijaws {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jojodu.book.intellijaws to javafx.fxml;
    exports com.jojodu.book.intellijaws;
}