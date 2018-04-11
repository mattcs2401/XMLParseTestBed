package mcssoft.com.xmlparsetestbed.database.entity;

import android.support.annotation.NonNull;

public class ShoppingItemType {

    public ShoppingItemType() {
        code = "";
        subCode = "";
        description = "";
    }

    public ShoppingItemType(@NonNull String code, @NonNull String subCode, String description) {
        this.code = code;
        this.subCode = subCode;
        this.description = description;
    }

    //<editor-fold defaultstate="collapsed" desc="Region: Getter/Setter">
    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    @NonNull
    public String getCode() {
        return code;
    }

    public void setCode(@NonNull String code) {
        this.code = code;
    }

    @NonNull
    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(@NonNull String subCode) {
        this.subCode = subCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //</editor-fold>

    // Columns for SHOPPING_ITEM_TYPE table.
    int id;                 // database row id.
    String code;
    String subCode;
    String description;
}
