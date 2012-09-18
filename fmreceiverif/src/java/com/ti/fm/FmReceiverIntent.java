/*
 * TI's FM
 *
 * Copyright 2001-2011 Texas Instruments, Inc. - http://www.ti.com/
 * Copyright 2010, 2011 Sony Ericsson Mobile Communications AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/*******************************************************************************\
 *
 *   FILE NAME:      FmReceiverIntent.java
 *
 *   BRIEF:          This file defines the API of the FM Rx stack.
 *
 *   DESCRIPTION:    General
 *
 *
 *
 *   AUTHOR:
 *
 \*******************************************************************************/
package com.ti.fm;

import android.annotation.SdkConstant;
import android.annotation.SdkConstant.SdkConstantType;

/**
 * Manages the FM Reception
 *
 * @hide
 */
public interface FmReceiverIntent {

    public static final String VOLUME = "com.ti.fm.rx.intent.VOLUME";

    public static final String MODE_MONO_STEREO = "com.ti.fm.rx.intent.MODE_MONO_STEREO";

    public static final String TUNED_FREQUENCY = "com.ti.fm.rx.intent.TUNED_FREQUENCY";

    public static final String SEEK_FREQUENCY = "com.ti.fm.rx.intent.SEEK_FREQUENCY";

    public static final String RDS = "com.ti.fm.rx.intent.RDS";

    public static final String PS = "com.ti.fm.rx.intent.PS";

    public static final String PI = "com.ti.fm.rx.intent.PI";

    public static final String REPERTOIRE = "com.ti.fm.rx.intent.REPERTOIRE";

    public static final String MUTE = "com.ti.fm.rx.intent.MUTE";

    public static final String STATUS = "com.ti.fm.rx.intent.STATUS";

    public static final String MASTER_VOLUME = "com.ti.fm.rx.intent.MASTER_VOLUME";

    public static final String CHANNEL_SPACE = "com.ti.fm.rx.intent.CHANNEL_SPACE";

    public static final String SCAN_LIST = "com.ti.fm.rx.intent.SCAN_LIST";

    public static final String SCAN_LIST_COUNT = "com.ti.fm.rx.intent.SCAN_LIST_COUNT";

    public static final String RADIOTEXT_CONVERTED = "com.ti.fm.rx.intent.RADIOTEXT_CONVERTED_VALUE";

    public static final String PS_CONVERTED = "com.ti.fm.rx.intent.PS_CONVERTED_VALUE";

    public static final String GET_BAND = "com.ti.fm.rx.intent.GET_BAND";

    public static final String GET_VOLUME = "com.ti.fm.rx.intent.GET_VOLUME";

    public static final String GET_MODE = "com.ti.fm.rx.intent.GET_MODE";

    public static final String GET_MUTE_MODE = "com.ti.fm.rx.intent.GET_MUTE_MODE";

    public static final String GET_RF_MUTE_MODE = "com.ti.fm.rx.intent.GET_RF_MUTE_MODE";

    public static final String GET_RSSI_THRESHHOLD = "com.ti.fm.rx.intent.GET_RSSI_THRESHHOLD";

    public static final String GET_DEEMPHASIS_FILTER = "com.ti.fm.rx.intent.GET_DEEMPHASIS_FILTER";

    public static final String GET_RSSI = "com.ti.fm.rx.intent.GET_RSSI";

    public static final String GET_RDS_SYSTEM = "com.ti.fm.rx.intent.GET_RDS_SYSTEM";

    public static final String GET_RDS_GROUPMASK = "com.ti.fm.rx.intent.GET_RDS_GROUPMASK";

    public static final String GET_RDS_AF_SWITCHMODE = "com.ti.fm.rx.intent.GET_RDS_AF_SWITCHMODE";

    public static final String GET_CHANNEL_SPACE = "com.ti.fm.rx.intent.GET_CHANNEL_SPACE";

    public static final String LAST_SCAN_CHANNEL = "com.ti.fm.rx.intent.LAST_SCAN_CHANNEL";

    public static final String SCAN_PROGRESS = "com.ti.fm.rx.intent.SCAN_PROGRESS";

    /**
     * ******** fM tx *****************
     */
    public static final String TX_MODE = "com.ti.fm.tx.intent.TX_MODE";

    public static final String MUSIC_SPEECH_FLAG = "com.ti.fm.tx.intent.MUSIC_SPEECH_FLAG";

    public static final String MONO_STEREO = "com.ti.fm.tx.intent.MONO_STEREO";

    public static final String DISPLAY_MODE = "com.ti.fm.tx.intent.DISPLAY_MODE";

    public static final String TX_REPERTOIRE = "com.ti.fm.tx.intent.REPERTOIRE";

    public static final String PS_MSG = "com.ti.fm.tx.intent.PSMSG";

    public static final String RDS_GRP_MASK = "com.ti.fm.tx.intent.RDS_GRP_MASK";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String FM_ENABLED_ACTION = "com.ti.fm.rx.intent.action.FM_ENABLED";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String FM_DISABLED_ACTION = "com.ti.fm.rx.intent.action.FM_DISABLED";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_FREQUENCY_ACTION = "com.ti.fm.rx.intent.action.GET_FREQUENCY";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SEEK_ACTION = "com.ti.fm.rx.intent.action.SEEK_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_MODE_MONO_STEREO_ACTION = "com.ti.fm.rx.intent.action.SET_MODE_MONOSTEREO";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String VOLUME_CHANGED_ACTION = "com.ti.fm.rx.intent.action.VOLUME_CHANGED_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String RDS_TEXT_CHANGED_ACTION = "com.ti.fm.rx.intent.action.RDS_TEXT_CHANGED";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String PS_CHANGED_ACTION = "com.ti.fm.rx.intent.action.PS_CHANGED";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String AUDIO_PATH_CHANGED_ACTION = "com.ti.fm.rx.intent.action.AUDIO_PATH_CHANGED_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String TUNE_COMPLETE_ACTION = "com.ti.fm.rx.intent.action.TUNE_COMPLETE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String MUTE_CHANGE_ACTION = "com.ti.fm.rx.intent.action.MUTE_CHANGE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SEEK_STOP_ACTION = "com.ti.fm.rx.intent.action.SEEK_STOP_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String BAND_CHANGE_ACTION = "com.ti.fm.rx.intent.action.BAND_CHANGE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_CHANNEL_SPACE_ACTION = "com.ti.fm.rx.intent.action.GET_CHANNEL_SPACE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String ENABLE_RDS_ACTION = "com.ti.fm.rx.intent.action.ENABLE_RDS_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String DISABLE_RDS_ACTION = "com.ti.fm.rx.intent.action.DISABLE_RDS_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_RDS_AF_ACTION = "com.ti.fm.rx.intent.action.SET_RDS_AF_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_RDS_SYSTEM_ACTION = "com.ti.fm.rx.intent.action.SET_RDS_SYSTEM_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_DEEMP_FILTER_ACTION = "com.ti.fm.rx.intent.action.SET_DEEMP_FILTER_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String DISPLAY_MODE_MONO_STEREO_ACTION = "com.ti.fm.rx.intent.action.DISPLAY_MODE_MONO_STEREO_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_RSSI_THRESHHOLD_ACTION = "com.ti.fm.rx.intent.action.SET_RSSI_THRESHHOLD_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_RF_DEPENDENT_MUTE_ACTION = "com.ti.fm.rx.intent.action.SET_RF_DEPENDENT_MUTE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String PI_CODE_CHANGED_ACTION = "com.ti.fm.rx.intent.action.PI_CODE_CHANGED_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String MASTER_VOLUME_CHANGED_ACTION = "com.ti.fm.rx.intent.action.MASTER_VOLUME_CHANGED_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_BAND_ACTION = "com.ti.fm.rx.intent.action.GET_BAND_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_MONO_STEREO_MODE_ACTION = "com.ti.fm.rx.intent.action.GET_MONO_STEREO_MODE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_MUTE_MODE_ACTION = "com.ti.fm.rx.intent.action.GET_MUTE_MODE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_RF_MUTE_MODE_ACTION = "com.ti.fm.rx.intent.action.GET_RF_MUTE_MODE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_RSSI_THRESHHOLD_ACTION = "com.ti.fm.rx.intent.action.GET_RSSI_THRESHHOLD_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_DEEMPHASIS_FILTER_ACTION = "com.ti.fm.rx.intent.action.GET_DEEMPHASIS_FILTER_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_RSSI_ACTION = "com.ti.fm.rx.intent.action.GET_RSSI_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_VOLUME_ACTION = "com.ti.fm.rx.intent.action.GET_VOLUME_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_RDS_SYSTEM_ACTION = "com.ti.fm.rx.intent.action.GET_RDS_SYSTEM_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_RDS_GROUPMASK_ACTION = "com.ti.fm.rx.intent.action.GET_RDS_GROUPMASK_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String GET_RDS_AF_SWITCH_MODE_ACTION = "com.ti.fm.rx.intent.action.GET_RDS_AF_SWITCH_MODE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String CHANNEL_SPACING_CHANGED_ACTION = "com.ti.fm.rx.intent.action.CHANNEL_SPACING_CHANGED_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String COMPLETE_SCAN_DONE_ACTION = "com.ti.fm.rx.intent.action.COMPLETE_SCAN_DONE_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String COMPLETE_SCAN_STOP_ACTION = "com.ti.fm.rx.intent.action.COMPLETE_SCAN_STOP_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_RDS_GROUP_MASK_ACTION = "com.ti.fm.rx.intent.action.SET_RDS_GROUP_MASK_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String COMPLETE_SCAN_PROGRESS_ACTION = "com.ti.fm.rx.intent.action.COMPLETE_SCAN_PROGRESS_ACTION";

    @SdkConstant(SdkConstantType.BROADCAST_INTENT_ACTION)
    public static final String SET_CHANNEL_SPACE_ACTION = "com.ti.fm.rx.intent.action.SET_CHANNEL_SPACE_ACTION";

}
