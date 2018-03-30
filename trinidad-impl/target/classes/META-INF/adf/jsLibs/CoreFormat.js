function TrIntegerConverter(
a0,
a1,
a2,
a3,
a4)
{
this._message=a0;
this._maxPrecision=a1;
this._maxScale=a2;
this._maxValue=a3;
this._minValue=a4;
this._class="TrIntegerConverter";
}
TrIntegerConverter.prototype=new TrConverter();
TrIntegerConverter.prototype.getFormatHint=function()
{
return null;
}
TrIntegerConverter.prototype.getAsString=function(
a5,
a6
)
{
return""+a5;
}
TrIntegerConverter.prototype.getAsObject=function(
a7,
a8
)
{
return _decimalParse(a7,
this._message,
"org.apache.myfaces.trinidad.convert.IntegerConverter",
this._maxPrecision,
this._maxScale,
this._maxValue,
this._minValue,
a8,
null);
}
function TrLongConverter(
a0,
a1,
a2,
a3,
a4)
{
this._message=a0;
this._maxPrecision=a1;
this._maxScale=a2;
this._maxValue=a3;
this._minValue=a4;
this._class="TrLongConverter";
}
TrLongConverter.prototype=new TrConverter();
TrLongConverter.prototype.getFormatHint=function()
{
return null;
}
TrLongConverter.prototype.getAsString=function(
a5,
a6
)
{
return""+a5;
}
TrLongConverter.prototype.getAsObject=function(
a7,
a8
)
{
return _decimalParse(a7,
this._message,
"org.apache.myfaces.trinidad.convert.LongConverter",
this._maxPrecision,
this._maxScale,
this._maxValue,
this._minValue,
a8,
null);
}
function TrShortConverter(
a0,
a1,
a2,
a3,
a4)
{
this._message=a0;
this._maxPrecision=a1;
this._maxScale=a2;
this._maxValue=a3;
this._minValue=a4;
this._class="TrShortConverter";
}
TrShortConverter.prototype=new TrConverter();
TrShortConverter.prototype.getFormatHint=function()
{
return null;
}
TrShortConverter.prototype.getAsString=function(
a5,
a6
)
{
return""+a5;
}
TrShortConverter.prototype.getAsObject=function(
a7,
a8
)
{
return _decimalParse(a7,
this._message,
"org.apache.myfaces.trinidad.convert.ShortConverter",
this._maxPrecision,
this._maxScale,
this._maxValue,
this._minValue,
a8,
null);
}
function TrByteConverter(
a0,
a1,
a2,
a3,
a4)
{
this._message=a0;
this._maxPrecision=a1;
this._maxScale=a2;
this._maxValue=a3;
this._minValue=a4;
this._class="TrByteConverter";
}
TrByteConverter.prototype=new TrConverter();
TrByteConverter.prototype.getFormatHint=function()
{
return null;
}
TrByteConverter.prototype.getAsString=function(
a5,
a6
)
{
return""+a5;
}
TrByteConverter.prototype.getAsObject=function(
a7,
a8
)
{
return _decimalParse(a7,
this._message,
"org.apache.myfaces.trinidad.convert.ByteConverter",
this._maxPrecision,
this._maxScale,
this._maxValue,
this._minValue,
a8,
null);
}
function TrDoubleConverter(
a0,
a1,
a2,
a3,
a4)
{
this._message=a0;
this._maxPrecision=a1;
this._maxScale=a2;
this._maxValue=a3;
this._minValue=a4;
this._class="TrDoubleConverter";
}
TrDoubleConverter.prototype=new TrConverter();
TrDoubleConverter.prototype.getFormatHint=function()
{
return null;
}
TrDoubleConverter.prototype.getAsString=function(
a5,
a6
)
{
var a7=""+a5;
var a8=a7.indexOf(".");
if(a8!=-1)
return a7;
else
return""+a5.toFixed(1);
}
TrDoubleConverter.prototype.getAsObject=function(
a9,
a10
)
{
return _decimalParse(a9,
this._message,
"org.apache.myfaces.trinidad.convert.DoubleConverter",
this._maxPrecision,
this._maxScale,
this._maxValue,
this._minValue,
a10,
true,
true);
}
function TrFloatConverter(
a0,
a1,
a2,
a3,
a4)
{
this._message=a0;
this._maxPrecision=a1;
this._maxScale=a2;
this._maxValue=a3;
this._minValue=a4;
this._class="TrFloatConverter";
}
TrFloatConverter.prototype=new TrConverter();
TrFloatConverter.prototype.getFormatHint=function()
{
return null;
}
TrFloatConverter.prototype.getAsString=function(
a5,
a6
)
{
var a7=""+a5;
var a8=a7.indexOf(".");
if(a8!=-1)
return a7;
else
return""+a5.toFixed(1);
}
TrFloatConverter.prototype.getAsObject=function(
a9,
a10
)
{
return _decimalParse(a9,
this._message,
"org.apache.myfaces.trinidad.convert.FloatConverter",
this._maxPrecision,
this._maxScale,
this._maxValue,
this._minValue,
a10,
true,
true);
}
function TrRangeValidator(
a0,
a1,
a2)
{
this._maxValue=a0;
this._minValue=a1;
this._messages=a2;
this._class="TrRangeValidator";
}
TrRangeValidator.prototype=new TrValidator();
TrRangeValidator.prototype.getHints=function(
a3
)
{
return _returnRangeHints(
this._messages,
this._maxValue,
this._minValue,
"org.apache.myfaces.trinidad.validator.RangeValidator.MAXIMUM_HINT",
"org.apache.myfaces.trinidad.validator.RangeValidator.MINIMUM_HINT",
"org.apache.myfaces.trinidad.validator.RangeValidator.RANGE_HINT",
"hintMax",
"hintMin",
"hintRange"
);
}
TrRangeValidator.prototype.validate=function(
a4,
a5,
a6
)
{
string=""+a4;
numberValue=parseFloat(string);
var a7;
if(this._minValue!=null&&this._maxValue!=null)
{
if(numberValue>=this._minValue&&numberValue<=this._maxValue)
{
return string;
}
else
{
var a8="org.apache.myfaces.trinidad.validator.LongRangeValidator.NOT_IN_RANGE";
if(this._messages&&this._messages["range"])
{
a7=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a8),
this._messages["range"],
a5,
string,
""+this._minValue,
""+this._maxValue);
}
else
{
a7=_createFacesMessage(a8,
a5,
string,
""+this._minValue,
""+this._maxValue);
}
}
}
else
{
if(this._minValue!=null)
{
if(numberValue>=this._minValue)
{
return string;
}
else
{
var a8="org.apache.myfaces.trinidad.validator.LongRangeValidator.MINIMUM";
if(this._messages&&this._messages["min"])
{
a7=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a8),
this._messages["min"],
a5,
string,
""+this._minValue);
}
else
{
a7=_createFacesMessage(a8,
a5,
string,
""+this._minValue);
}
}
}
else
{
if(this._maxValue==null||numberValue<=this._maxValue)
{
return string;
}
else
{
var a8="org.apache.myfaces.trinidad.validator.LongRangeValidator.MAXIMUM";
if(this._messages&&this._messages["max"])
{
a7=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a8),
this._messages["max"],
a5,
string,
""+this._maxValue);
}
else
{
a7=_createFacesMessage(a8,
a5,
string,
""+this._maxValue);
}
}
}
}
throw new TrConverterException(a7);
}
function TrLengthValidator(
a0,
a1,
a2)
{
this._maxValue=a0;
this._minValue=a1;
this._messages=a2;
this._class="TrLengthValidator";
}
TrLengthValidator.prototype=new TrValidator();
TrLengthValidator.prototype.getHints=function(
a3
)
{
return _returnRangeHints(
this._messages,
this._maxValue,
this._minValue,
"org.apache.myfaces.trinidad.validator.LengthValidator.MAXIMUM_HINT",
"org.apache.myfaces.trinidad.validator.LengthValidator.MINIMUM_HINT",
(this._minValue==this._maxValue)
?"org.apache.myfaces.trinidad.validator.LengthValidator.EXACT_HINT"
:"org.apache.myfaces.trinidad.validator.LengthValidator.RANGE_HINT",
"hintMax",
"hintMin",
"hintRange"
);
}
TrLengthValidator.prototype.validate=function(
a4,
a5,
a6
)
{
var a7=""+a4;
var a8=a7.length;
if(a8>=this._minValue&&
((this._maxValue==null)||(a8<=this._maxValue)))
{
return a7;
}
else
{
if((this._minValue>0)&&(this._maxValue!=null))
{
var a9=(this._minValue==this._maxValue);
var a10=a9
?"org.apache.myfaces.trinidad.validator.LengthValidator.EXACT"
:"org.apache.myfaces.trinidad.validator.LengthValidator.NOT_IN_RANGE";
var a11;
var a12="range";
if(this._messages&&this._messages[a12])
{
a11=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a10),
this._messages[a12],
a5,
a7,
""+this._minValue,
""+this._maxValue);
}
else
{
a11=_createFacesMessage(a10,
a5,
a7,
""+this._minValue,
""+this._maxValue);
}
throw new TrConverterException(a11);
}
else if(a8<this._minValue)
{
var a10="org.apache.myfaces.trinidad.validator.LengthValidator.MINIMUM";
var a11;
if(this._messages&&this._messages["min"])
{
a11=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a10),
this._messages["min"],
a5,
a7,
""+this._minValue);
}
else
{
a11=_createFacesMessage(a10,
a5,
a7,
""+this._minValue);
}
throw new TrConverterException(a11);
}
else
{
var a10="org.apache.myfaces.trinidad.validator.LengthValidator.MAXIMUM";
var a11;
if(this._messages&&this._messages["max"])
{
a11=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a10),
this._messages["max"],
a5,
a7,
""+this._maxValue);
}
else
{
a11=_createFacesMessage(a10,
a5,
a7,
""+this._maxValue);
}
throw new TrConverterException(a11);
}
}
}
function TrDateTimeRangeValidator(
a0,
a1,
a2)
{
this._maxValue=a0;
this._minValue=a1;
this._messages=a2;
this._class="TrDateTimeRangeValidator";
}
TrDateTimeRangeValidator.prototype=new TrValidator();
TrDateTimeRangeValidator.prototype.getHints=function(
a3
)
{
var a4=null;
var a5=null;
if(this._maxValue)
a4=this._maxValue;
if(this._minValue)
a5=this._minValue;
return _returnRangeHints(
this._messages,
a4,
a5,
"org.apache.myfaces.trinidad.validator.DateTimeRangeValidator.MAXIMUM_HINT",
"org.apache.myfaces.trinidad.validator.DateTimeRangeValidator.MINIMUM_HINT",
"org.apache.myfaces.trinidad.validator.DateTimeRangeValidator.RANGE_HINT",
"hintMax",
"hintMin",
"hintRange"
);
}
TrDateTimeRangeValidator.prototype.validate=function(
a6,
a7,
a8
)
{
dateTime=a6.getTime();
var a9;
if(this._minValue&&this._maxValue)
{
try
{
minDate=(a8.getAsObject(this._minValue)).getTime();
maxDate=(a8.getAsObject(this._maxValue)).getTime();
}
catch(e)
{
return a6;
}
if(dateTime>=minDate&&dateTime<=maxDate)
{
return a6;
}
else
{
var a10="org.apache.myfaces.trinidad.validator.DateTimeRangeValidator.NOT_IN_RANGE";
if(this._messages&&this._messages["range"])
{
a9=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a10),
this._messages["range"],
a7,
""+a8.getAsString(a6),
""+this._minValue,
""+this._maxValue);
}
else
{
a9=_createFacesMessage(a10,
a7,
""+a8.getAsString(a6),
""+this._minValue,
""+this._maxValue);
}
}
}
else
{
if(this._minValue)
{
try
{
minDate=(a8.getAsObject(this._minValue)).getTime();
}
catch(e)
{
return a6;
}
if(dateTime>=minDate)
{
return a6;
}
else
{
var a10="org.apache.myfaces.trinidad.validator.DateTimeRangeValidator.MINIMUM";
if(this._messages&&this._messages["min"])
{
a9=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a10),
this._messages["min"],
a7,
""+a8.getAsString(a6),
""+this._minValue);
}
else
{
a9=_createFacesMessage(a10,
a7,
""+a8.getAsString(a6),
""+this._minValue);
}
}
}
else if(this._maxValue)
{
try
{
maxDate=(a8.getAsObject(this._maxValue)).getTime();
}
catch(e)
{
return a6;
}
if(dateTime<=maxDate)
{
return a6;
}
else
{
var a10="org.apache.myfaces.trinidad.validator.DateTimeRangeValidator.MAXIMUM";
if(this._messages&&this._messages["max"])
{
a9=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a10),
this._messages["max"],
a7,
""+a8.getAsString(a6),
""+this._maxValue);
}
else
{
a9=_createFacesMessage(a10,
a7,
""+a8.getAsString(a6),
""+this._maxValue);
}
}
}
else
{
return a6;
}
}
throw new TrConverterException(a9);
}
function TrDateRestrictionValidator(
a0,
a1,
a2)
{
this._weekdaysValue=a0;
this._monthValue=a1;
this._messages=a2;
this._weekdaysMap={'2':'tue','4':'thu','6':'sat','1':'mon','3':'wed','5':'fri','0':'sun'};
this._translatedWeekdaysMap={'sun':'0','mon':'1','tue':'2','wed':'3','thu':'4','fri':'5','sat':'6'};
this._monthMap={'2':'mar','4':'may','9':'oct','8':'sep','11':'dec','6':'jul','1':'feb','3':'apr','10':'nov','7':'aug','5':'jun','0':'jan'};
this._translatedMonthMap={'jan':'0','feb':'1','mar':'2','apr':'3','may':'4','jun':'5','jul':'6','aug':'7','sep':'8','oct':'9','nov':'10','dec':'11'};
this._class="TrDateRestrictionValidator";
}
TrDateRestrictionValidator.prototype=new TrValidator();
TrDateRestrictionValidator.prototype.getHints=function(
a3
)
{
var a4=['mon','tue','wed','thu','fri','sat','sun'];
var a5=['jan','feb','mar','apr','may','jun','jul','aug','sep','oct','nov','dec'];
if(this._weekdaysValue)
TrCollections.removeValuesFromArray(this._weekdaysValue,a4);
if(this._monthValue)
TrCollections.removeValuesFromArray(this._monthValue,a5);
return _returnHints(
this._messages,
!this._weekdaysValue?this._weekdaysValue:this._translate(a4,this._translatedWeekdaysMap,a3.getLocaleSymbols().getWeekdays()),
!this._monthValue?this._monthValue:this._translate(a5,this._translatedMonthMap,a3.getLocaleSymbols().getMonths()),
"org.apache.myfaces.trinidad.validator.DateRestrictionValidator.WEEKDAY_HINT",
"org.apache.myfaces.trinidad.validator.DateRestrictionValidator.MONTH_HINT",
"hintWeek",
"hintMonth"
);
}
TrDateRestrictionValidator.prototype._translate=function(
values,
map,
valueArray
)
{
if(values)
{
var translatedValues=new Array();
var valuesAsArray=eval(values);
for(i=0;i<valuesAsArray.length;i++)
{
translatedValues.push(valueArray[map[valuesAsArray[i].toLowerCase()]]);
}
return eval(translatedValues);
}
else
{
return values;
}
}
TrDateRestrictionValidator.prototype.validate=function(
value,
label,
converter
)
{
submittedDay=value.getDay();
weekDaysArray=eval(this._weekdaysValue);
if(weekDaysArray)
{
var dayString=this._weekdaysMap[submittedDay];
for(var i=0;i<weekDaysArray.length;++i)
{
if(weekDaysArray[i].toLowerCase()==dayString)
{
var allWeekdays=['mon','tue','wed','thu','fri','sat','sun'];
TrCollections.removeValuesFromArray(this._weekdaysValue,allWeekdays);
var days=_trToString(this._translate(allWeekdays,this._translatedWeekdaysMap,converter.getLocaleSymbols().getWeekdays()));
var facesMessage;
var key="org.apache.myfaces.trinidad.validator.DateRestrictionValidator.WEEKDAY";
if(this._messages&&this._messages["days"])
{
facesMessage=_createCustomFacesMessage(TrMessageFactory.getSummaryString(key),
this._messages["days"],
label,
""+converter.getAsString(value),
days);
}
else
{
facesMessage=_createFacesMessage(key,
label,
""+converter.getAsString(value),
days);
}
throw new TrConverterException(facesMessage);
}
}
}
submittedMonth=value.getMonth();
monthArray=eval(this._monthValue);
if(monthArray)
{
var monthString=this._monthMap[submittedMonth];
for(var i=0;i<monthArray.length;++i)
{
if(monthArray[i].toLowerCase()==monthString)
{
var allMonth=['jan','feb','mar','apr','may','jun','jul','aug','sep','oct','nov','dec'];
TrCollections.removeValuesFromArray(this._monthValue,allMonth);
var month=_trToString(this._translate(allMonth,this._translatedMonthMap,converter.getLocaleSymbols().getMonths()));
var facesMessage;
var key="org.apache.myfaces.trinidad.validator.DateRestrictionValidator.MONTH";
if(this._messages&&this._messages["month"])
{
facesMessage=_createCustomFacesMessage(TrMessageFactory.getSummaryString(key),
this._messages["month"],
label,
""+converter.getAsString(value),
month);
}
else
{
facesMessage=_createFacesMessage(key,
label,
""+converter.getAsString(value),
month);
}
throw new TrConverterException(facesMessage);
}
}
}
return value;
}
function _decimalParse(
a0,
a1,
a2,
a3,
a4,
a5,
a6,
a7,
a8,
a9
)
{
if(a0==null)
return null;
a0=TrUIUtils.trim(a0);
if(a0.length==0)
return null
var a10=null;
var a11=getLocaleSymbols();
if(a11&&(a9!=true))
{
var a12=a11.getGroupingSeparator();
if((a0.indexOf(a12)==0)||
(a0.lastIndexOf(a12)==(a0.length-1)))
{
a10=_createFacesMessage(a2+".CONVERT",
a7,
a0);
throw new TrConverterException(a10);
}
if(a12=="\xa0"){
var a13=new RegExp("\\ ","g");
a0=a0.replace(a13,"\xa0");
}
var a14=new RegExp("\\"+a12,"g");
a0=a0.replace(a14,"");
var a15=new RegExp("\\"+a11.getDecimalSeparator(),"g");
a0=a0.replace(a15,".");
}
if((a0.indexOf('e')<0)&&
(a0.indexOf('E')<0)&&
(((a0*a0)==0)||
((a0/a0)==1)))
{
var a16=null;
var a17=false;
if(a8!=null)
{
a16=parseFloat(a0);
}
else
{
a16=parseInt(a0);
if(a16<parseFloat(a0))
{
a17=true;
}
}
if(!a17&&!isNaN(a16))
{
var a18=a0.length;
var a19=0;
var a20=a0.lastIndexOf('.');
if(a20!=-1)
{
a18=a20;
a19=parseInt(a0.length-parseInt(a20-1));
}
var a21;
var a22;
if((a5!=null)&&
(a16>a5))
{
a21=a2+".MAXIMUM";
a22=a5;
}
else if((a6!=null)&&
(a16<a6))
{
a21=a2+".MINIMUM";
a22=a6;
}
if(a21)
{
a10=_createFacesMessage(a21,
a7,
a0,
""+a22);
throw new TrConverterException(a10);
}
return a16;
}
}
var a23=null;
var a24=false;
if(a2.indexOf("NumberConverter")==-1)
{
a23=a2+".CONVERT";
}
else
{
a23=a2+".CONVERT_NUMBER";
if(a1&&a1["number"])
{
a10=_createCustomFacesMessage(TrMessageFactory.getSummaryString(a23),
a1["number"],
a7,
a0);
a24=true;
}
}
if(!a24)
{
a10=_createFacesMessage(a23,
a7,
a0);
}
throw new TrConverterException(a10);
}
function TrRegExpValidator(
a0,
a1
)
{
this._pattern=a0;
this._messages=a1;
this._class="TrRegExpValidator";
}
TrRegExpValidator.prototype=new TrValidator();
TrRegExpValidator.prototype.getHints=function(
a2
)
{
var a3=null;
if(this._messages["hint"])
{
a3=new Array();
a3.push(TrMessageFactory.createCustomMessage(
this._messages["hint"],
""+this._pattern)
);
}
return a3;
}
TrRegExpValidator.prototype.validate=function(
a4,
a5,
a6
)
{
a4=a4+'';
var a7="^("+this._pattern+")$";
var a8=a4.match(a7);
if((a8!=(void 0))&&(a8[0]==a4))
{
return a4;
}
else
{
var a9="org.apache.myfaces.trinidad.validator.RegExpValidator.NO_MATCH";
var a10;
if(this._messages&&this._messages["detail"])
{
a10=_createCustomFacesMessage(
TrMessageFactory.getSummaryString(a9),
this._messages["detail"],
a5,
a4,
this._pattern);
}
else
{
a10=_createFacesMessage(a9,
a5,
a4,
this._pattern);
}
throw new TrValidatorException(a10);
}
}
function _returnRangeHints(
a0,
a1,
a2,
a3,
a4,
a5,
a6,
a7,
a8
)
{
if(a1&&a2)
{
var a9=new Array();
if(a0&&a0[a8])
{
a9.push(
TrMessageFactory.createCustomMessage(
a0[a8],
""+a2,
""+a1)
);
}
else
{
a9.push(
TrMessageFactory.createMessage(
a5,
""+a2,
""+a1)
);
}
return a9;
}
return _returnHints(
a0,
a1,
a2,
a3,
a4,
a6,
a7
);
}
function _trToString(a0)
{
if(Array.prototype.isPrototypeOf(a0))
{
return a0.join(", ");
}
else
{
return""+a0;
}
}
function _returnHints(
a0,
a1,
a2,
a3,
a4,
a5,
a6
)
{
var a7;
if(a1)
{
a7=new Array();
if(a0&&a0[a5])
{
a7.push(
TrMessageFactory.createCustomMessage(
a0[a5],
_trToString(a1))
);
}
else
{
a7.push(
TrMessageFactory.createMessage(
a3,
_trToString(a1))
);
}
}
if(a2)
{
if(!a7)
{
a7=new Array();
}
if(a0&&a0[a6])
{
a7.push(
TrMessageFactory.createCustomMessage(
a0[a6],
_trToString(a2))
);
}
else
{
a7.push(
TrMessageFactory.createMessage(
a4,
_trToString(a2))
);
}
}
return a7;
}
