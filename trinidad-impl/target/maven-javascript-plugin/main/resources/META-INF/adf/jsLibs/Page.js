function TrPage()
{
this._loadedLibraries=TrPage._collectLoadedLibraries();
this._requestQueue=new TrRequestQueue(window);
}
TrPage.getInstance=function()
{
if(TrPage._INSTANCE==null)
TrPage._INSTANCE=new TrPage();
return TrPage._INSTANCE;
}
TrPage.prototype.getRequestQueue=function()
{
return this._requestQueue;
}
TrPage.prototype.sendPartialFormPost=function(
a0,
a1,
a2)
{
this.getRequestQueue().sendFormPost(
this,this._requestStatusChanged,
a0,a1,a2);
}
TrPage.prototype._requestStatusChanged=function(a3)
{
if(a3.getStatus()==TrXMLRequestEvent.STATUS_COMPLETE)
{
var a4=a3.getResponseStatusCode();
if(a4==200)
{
_pprStopBlocking(window);
if(a3.isPprResponse())
{
var a5=a3.getResponseXML();
if(a5!=null)
{
this._handlePprResponse(a5.documentElement);
}
}
else
{
}
}
else if(a4>=400)
{
_pprStopBlocking(window);
}
}
}
TrPage.prototype._handlePprResponse=function(a6)
{
var a7=TrPage._getNodeName(a6);
if(a7=="content")
{
this._handlePprResponseAction(a6);
var a8=a6.childNodes;
var a9=a8.length;
for(var a10=0;a10<a9;a10++)
{
var a11=a8[a10];
var a12=TrPage._getNodeName(a11);
if(a12=="fragment")
{
this._handlePprResponseFragment(a11);
}
else if(a12=="script")
{
this._handlePprResponseScript(a11);
}
else if(a12=="script-library")
{
this._handlePprResponseLibrary(a11);
}
}
}
else if(a7=="redirect")
{
var a13=TrPage._getTextContent(a6);
window.location.href=a13;
}
else if(a7=="error")
{
var a14=TrPage._getTextContent(a6);
if(a14==null)
a14="Unknown error during PPR";
alert(a14);
}
else if(a7=="noop")
{
}
else
{
window.location.reload(true);
}
}
TrPage.prototype._addResetFields=function(a15,a16)
{
var a17=this._resetFields;
if(!a17)
{
a17=new Object();
this._resetFields=a17;
}
var a18=a17[a15];
if(!a18)
{
a18=new Object();
a17[a15]=a18;
}
for(var a19=0;a19<a16.length;a19++)
{
a18[a16[a19]]=true;
}
}
TrPage.prototype._resetHiddenValues=function(a20)
{
var a21=this._resetFields;
if(a21)
{
var a22=a21[a20.getAttribute("name")];
if(a22)
{
for(var a23 in a22)
{
var a24=a20[a23];
if(!a24)
a24=a20.elements.currField;
if(a24)
a24.value='';
}
}
}
}
TrPage.prototype._addResetCalls=function(
a25,
a26)
{
var a27=this._resetCalls;
if(!a27)
{
a27=new Object();
this._resetCalls=a27;
}
var a28=a27[a25];
if(!a28)
{
a28=new Object();
a27[a25]=a28;
}
for(var a29 in a26)
{
a28[a29]=a26[a29];
}
}
TrPage.prototype._resetForm=function(form)
{
var resetCalls=this._resetCalls;
if(!resetCalls)
return false;
var formReset=resetCalls[form.getAttribute("name")];
if(!formReset)
return false;
var doReload=false;
for(var k in formReset)
{
var trueResetCallback=unescape(formReset[k]);
if(eval(trueResetCallback))
doReload=true;
}
return doReload;
}
TrPage._getNodeName=function(a30)
{
var a31=a30.nodeName;
if(!a31)
a31=a30.tagName;
return a31;
}
TrPage.prototype._handlePprResponseAction=function(a32)
{
var a33=a32.getAttribute("action");
if(a33)
{
var a34=window.document;
a34.forms[0].action=a33;
}
}
TrPage.prototype._handlePprResponseFragment=function(a35)
{
var a36=window.document;
var a37;
var a38;
var a39=null;
if(_agent.isWindowsMobile6)
{
var a40=a35.childNodes[0];
if(!a40)
return;
var a41=a40.data;
tempDiv=a36.createElement("div");
tempDiv.id="tempDiv";
tempDiv.hidden="true";
var a42=a36.body;
a42.appendChild(tempDiv);
tempDiv.innerHTML=a41;
var a43=TrPage._getFirstElementWithId(tempDiv);
var a37=_getElementById(a36,a43.id);
if(!a37)
{
return;
}
a38=_getActiveElement();
if(a38&&TrPage._isDomAncestorOf(a38,a37))
a39=a38.id;
a37.parentNode.insertBefore(a43,a37);
a37.innerHTML="";
a37.parentNode.removeChild(a37);
tempDiv.innerHTML="";
a42.removeChild(tempDiv);
}
else
{
var a43=this._getFirstElementFromFragment(a35);
if(!a43)
return;
var a44=a43.getAttribute("id");
if(!a44)
return;
a37=_getElementById(a36,a44);
a38=_getActiveElement();
if(a38&&TrPage._isDomAncestorOf(a38,a37))
a39=a38.id;
if(a37)
a37.parentNode.replaceChild(a43,a37);
}
var a45=this._domReplaceListeners;
if(a45)
{
for(var a46=0;a46<a45.length;a46+=2)
{
var a47=a45[a46];
var a48=a45[a46+1];
if(a48!=null)
a47.call(a48,a37,a43);
else
a47(a37,a43);
}
}
if(a39)
{
a38=a36.getElementById(a39);
if(a38&&a38.focus)
{
a38.focus();
window._trActiveElement=a38;
}
}
}
TrPage._isDomAncestorOf=function(a49,a50)
{
while(a49)
{
if(a49==a50)
return true;
var a51=a49.parentNode;
if(a51==a49)
break;
a49=a51;
}
return false;
}
TrPage.prototype.__replaceDomElement=function(a52,a53)
{
a53.parentNode.replaceChild(a52,a53);
}
TrPage.prototype._getFirstElementFromFragment=function(a54)
{
var a55=a54.childNodes;
var a56=a54.childNodes[0];
var a57=a56.data;
var a58=window.document;
var a59=a58.createElement("div");
a59.innerHTML=a57;
return TrPage._getFirstElementWithId(a59);
}
TrPage._getFirstElementWithId=function(a60)
{
var a61=a60.childNodes;
var a62=a61.length;
for(var a63=0;a63<a62;a63++)
{
var a64=a61[a63];
if(a64.id)
{
if(!_agent.supportsNodeType)
{
return a64;
}
else if(a64.nodeType==1)
{
return a64;
}
}
return TrPage._getFirstElementWithId(a64);
}
return null;
}
TrPage.prototype._loadScript=function(source)
{
var loadedLibraries=this._loadedLibraries;
if(loadedLibraries[source])
return;
loadedLibraries[source]=true;
var xmlHttp=new TrXMLRequest();
xmlHttp.setSynchronous(true);
xmlHttp.send(source,null);
if(xmlHttp.getStatus()==200)
{
var responseText=xmlHttp.getResponseText();
if(responseText)
{
if(_agent.isIE)
window.execScript(responseText);
else
window.eval(responseText);
}
}
xmlHttp.cleanup();
}
TrPage.prototype._handlePprResponseScript=function(scriptNode)
{
var source=scriptNode.getAttribute("src");
if(source)
{
this._loadScript(source);
}
else
{
var nodeText=TrPage._getTextContent(scriptNode);
if(nodeText)
{
if(_agent.isIE)
window.execScript(nodeText);
else
window.eval(nodeText);
}
}
}
TrPage.prototype._handlePprResponseLibrary=function(a65)
{
var a66=TrPage._getTextContent(a65);
this._loadScript(a66);
}
TrPage._getTextContent=function(a67)
{
if(_agent.isIE)
{
var a68=a67.innerText;
if(a68==undefined)
a68=a67.text;
return a68;
}
if(_agent.isSafari)
{
var a69="";
var a70=a67.firstChild;
while(a70)
{
var a71=a70.nodeType;
if((a71==3)||(a71==4))
a69=a69+a70.data;
a70=a70.nextSibling;
}
return a69;
}
return a67.textContent;
}
TrPage._collectLoadedLibraries=function()
{
if(!_agent.supportsDomDocument)
{
return null;
}
else
{
var a72=new Object();
var a73=window.document;
var a74=a73.getElementsByTagName("script");
if(a74!=null)
{
for(var a75=0;a75<a74.length;a75++)
{
var a76=a74[a75].getAttribute("src");
if(a76)
{
a72[a76]=true;
}
}
}
return a72;
}
}
TrPage.prototype.addDomReplaceListener=function(a77,a78)
{
var a79=this._domReplaceListeners;
if(!a79)
{
a79=new Array();
this._domReplaceListeners=a79;
}
a79.push(a77);
a79.push(a78);
}
TrPage.prototype.removeDomReplaceListener=function(a80,a81)
{
var a82=this._domReplaceListeners;
var a83=a82.length;
for(var a84=0;a84<a83;a84++)
{
var a85=a82[a84];
a84++;
if(a85==a80)
{
var a86=a82[a84];
if(a86===a81)
{
a82.splice(a84-1,2);
break;
}
}
}
if(a82.length==0)
{
this._domReplaceListeners=null;
}
}
TrPage.prototype.addStyleClassMap=function(a87)
{
if(!a87)
return;
if(!this._styleClassMap)
this._styleClassMap=new Object();
for(var a88 in a87)
this._styleClassMap[a88]=a87[a88];
}
TrPage.prototype.getStyleClass=function(a89)
{
if(a89&&this._styleClassMap)
{
var a90=this._styleClassMap[a89];
if(a90)
return a90;
}
return a89;
}
TrPage._autoSubmit=function(a91,a92,a93,a94,a95)
{
if(_agent.isIE)
{
if(a93["type"]=="hidden")
a93=window.event;
}
var a96=true;
if(_TrEventBasedValidation)
a96=_validateInput(a93,true);
if(a96)
{
if(!a95)
a95=new Object();
a95.event="autosub";
a95.source=a92;
_submitPartialChange(a91,a94,a95);
}
}
