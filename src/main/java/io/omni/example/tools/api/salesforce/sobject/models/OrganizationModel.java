package io.omni.example.tools.api.salesforce.sobject.models;

import com.google.gson.annotations.SerializedName;

public class OrganizationModel {

    @SerializedName("Id")
    private String id;

    public String getId() {
        return id;
    }
}
