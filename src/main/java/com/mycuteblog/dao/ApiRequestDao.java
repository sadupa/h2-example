package com.mycuteblog.dao;

import com.mycuteblog.model.ApiRequest;

/**
 * (C) Copyright 2016 hSenid Mobile Solutions (Pvt) Limited.
 * All Rights Reserved.
 * <p/>
 * These materials are unpublished, proprietary, confidential source code of
 * hSenid Mobile Solutions (Pvt) Limited and constitute a TRADE SECRET
 * of hSenid Mobile Solutions (Pvt) Limited.
 * <p/>
 * hSenid Mobile Solutions (Pvt) Limited retains all title to and intellectual
 * property rights in these materials.
 *
 * @Author Sadupa Wijeratne
 * Created on : 10/23/16 7:34 PM
 */
public interface ApiRequestDao{
    void create(ApiRequest apiRequest);
    void update(ApiRequest apiRequest);
}
