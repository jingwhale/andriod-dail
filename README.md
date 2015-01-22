# andriod-dail
Dail is developed based eclipce andriod platform software, its main function is to call. This software is only imitate simple function call.<br>
As follows:<br>
![](https://github.com/jingwhale/andriod-Dail/raw/master/README.png)
Layout：
-------
Using RelativeLayout, EditText property controls the text input, Button control dial action.
Activity：
-------
Using the Button setOnClickListener to a button click event registration, achieve interface of setOnClickListener  by New MyListener functtion , enabling the parameters passed setOnClickListener. This is not only for the button click event registration method, of course, is not the best approach.<br>
<br>
Intent to be used by ACTION_CALL setAction function call system to achieve through setData Uri format number and dial out. By TextUtils.isEmpty function to determine whether the telephone number is null. Finally add android.permission.CALL PHONE privileges, and ultimately call the function.
