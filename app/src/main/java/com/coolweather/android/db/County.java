package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by xinxin on 2018/8/13.
 */

public class County extends DataSupport {
    private int idl;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getIdl() {
        return idl;
    }

    public void setIdl(int idl) {
        this.idl = idl;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
