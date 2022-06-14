/*
 * Copyright (C) 2016 AriaLyy(https://github.com/AriaLyy/Aria)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arialyy.simple.core.download.group;

import android.content.Context;
import com.arialyy.simple.R;
import com.arialyy.simple.base.BaseModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lyy on 2017/7/6.
 */
public class GroupModule extends BaseModule {
  public GroupModule(Context context) {
    super(context);
  }

  public List<String> getUrls() {
    List<String> urls = new ArrayList<>();
    String url1 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/06/0665b0f928e1d4685a93077ee6173887ab1151ae/6160110040AK.zip?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2F9349506614339515d490bff0d94772839f63a8e0e6be70a47cd04c39991da300";
    String url2 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/a6/a66eadf84469d85fda103d841d24798947ef731d/6120110040AD.zip?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2F5ef8a4a1d85fe8ce6b5a576509451187c4d93af8120efc3cdffd056cae4488a9";
    String url4 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/ae/ae75a9b8fa5af173cb0eb56a16b9b77c9c208f70/6130110040AC.zip?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2F2f7b0b2ec5f3cb7542bc87433ca52fef6d64ab7958b10c89b224bef5d58cf332";
    String url6 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/1b/1b8aa04988a659d30e23d33b1d5be83ca58d02bb/6110110040AF.zip?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2F367b0ef7a2921fe9aa65b6886650f90377114ca629351239d3dc46d9acb61b8e";
    String url5 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/00/00aa3604ff0aa81dd95cdec7fc91e230ed6208dd/6110210040AA.vbf?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2F63b6ca48d583fe3d379192ddcd164c2a6e3989ee56809b32d14eb78c0acfa0ef";
    String url7 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/4b/4ba1cca662b27581fa1aca9fa07a3e8132878a24/1110210040AA.vbf?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2F3bd6e394254946710fb445a9b363ff3de9a9c5dae8c81028dbd961c8a10d7373";
    String url8 = "https://t-ivs-fota.cdn.bcebos.com/canary/encrypt/artifactory-ha/filestore/ca/ca06209ca4d28667ce68bf99765b9d0c55a3772c/6110410040AA.vbf?authorization=bce-auth-v1%2F289a3f3e82b34da4973652d035b59cc3%2F2022-06-11T14%3A34%3A12Z%2F-1%2F%2Ff5d67ce6a275c73ed741c6721622e0ec09475214f495e1d1e1a0e300a643be7c";

    urls.add(url1);
    urls.add(url2);
    urls.add(url4);
    urls.add(url5);
    urls.add(url6);
    urls.add(url7);
    urls.add(url8);
    return urls;
  }
  List<String> getUrls1() {
    List<String> urls = new ArrayList<>();
    //String[] str = getContext().getResources().getStringArray(R.array.group_urls);
    //Collections.addAll(urls, str);
    urls.add(
            "https://d.pcs.baidu.com/file/130335545f3f4d9cc38afe709c19af5a?fid=1411168371-250528-1010657263806840&dstime=1531134607&rt=sh&sign=FDtAERVY-DCb740ccc5511e5e8fedcff06b081203-sNCujT7lC42aMcfiHcgqAzYHuw4%3D&expires=8h&chkv=1&chkbd=0&chkpc=et&dp-logid=4401967667009194668&dp-callid=0&r=540192514");
    return urls;
  }

  List<String> getSubName() {
    List<String> names = new ArrayList<>();
    //String[] str = getContext().getResources().getStringArray(R.array.group_names);
    //Collections.addAll(names, str);
    names.add("vbf1");
    names.add("vbf2");
    names.add("vbf4");
    names.add("vbf5");
    names.add("vbf6");
    names.add("vbf7");
    names.add("vbf8");
    //names.add("4.png");
    //names.add("5.png");
    return names;
  }

  List<String> getSubName1() {
    List<String> names = new ArrayList<>();
    String[] str = getContext().getResources().getStringArray(R.array.group_names);
    Collections.addAll(names, str);
    return names;
  }


  public List<String> getUrls2() {
    List<String> downLoadUrls;
    downLoadUrls = new ArrayList<>();
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2156&clientId=A000011106034058176");
    //        downLoadUrls.add("http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2115&clientId=A000011106034058176");
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2009&clientId=A000011106034058176");
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1893&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1952&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1958&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1994&clientId=A000011106034058176");
    //downLoadUrls.add(
    //    "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2083&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2305&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2183&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2154&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2153&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2152&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2151&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2149&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2148&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2147&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=2146&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1949&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1887&clientId=A000011106034058176");
    downLoadUrls.add(
            "http://d.quanscreen.com/k/down/resourceDownLoad?resourceId=1996&clientId=A000011106034058176");
    return downLoadUrls;
  }
}

