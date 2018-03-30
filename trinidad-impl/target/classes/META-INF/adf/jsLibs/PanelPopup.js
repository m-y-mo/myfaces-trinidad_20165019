TrPanelPopup.showPopup=function(
a0,
a1,
a2,
a3,
a4,
a5,
a6,
a7,
a8,
a9)
{
if(a0==null)
return;
var a10=TrPanelPopup._VISIBLE_POPUPS;
if(!a10)
a10=TrPanelPopup._VISIBLE_POPUPS=new Object();
if(a10[a0])
return;
if(a3=="hover")
a10[a0]=new TrHoverPopup();
else
a10[a0]=new TrClickPopup();
var a11=a10[a0];
var a12=document.getElementById(a0);
if(!a12)
return;
a11.setContent(a12);
a11.setTrigger(document.getElementById(a1));
a11.setModal(a5);
a11.setCentered(a4=='centered');
a11.setSize(a6,a7);
a11.setRelativeOffsetX(a8);
a11.setRelativeOffsetY(a9);
a11.showPopup(a2);
}
TrPanelPopup.hidePopup=function(a13)
{
a13=window.event||a13;
var a14=TrPanelPopup._VISIBLE_POPUPS;
if(!a14)
return;
var a15=a13.target||a13.srcElement;
while(a15)
{
var a16=a15.id;
if(a16)
{
var a17=a14[a16];
if(a17)
{
a17.hide(a13);
break;
}
}
a15=a15.parentNode;
}
}
function TrPanelPopup()
{
this._content=false;
this._trigger=false;
this._centered=false;
this._modal=false;
this._visible=false;
}
TrPanelPopup.prototype.getContent=function()
{
return this._content;
}
TrPanelPopup.prototype.setContent=function(a0)
{
this._content=a0;
if(this._content)
{
this._content.style.cssText="position: absolute; z-index: 5001; top: 0px; left: 0px; visibility:hidden; padding: 0px;";
}
}
TrPanelPopup.prototype.getTrigger=function()
{
return this._trigger;
}
TrPanelPopup.prototype.setTrigger=function(a1)
{
this._trigger=a1;
}
TrPanelPopup.prototype.setCentered=function(a2)
{
this._centered=a2;
}
TrPanelPopup.prototype.isModal=function()
{
return this._modal;
}
TrPanelPopup.prototype.setModal=function(a3)
{
this._modal=a3;
}
TrPanelPopup.prototype.setRelativeOffsetX=function(a4)
{
this._relativeOffsetX=parseInt(a4);
}
TrPanelPopup.prototype.getRelativeOffsetX=function()
{
return(this._relativeOffsetX)?this._relativeOffsetX:0;
}
TrPanelPopup.prototype.setRelativeOffsetY=function(a5)
{
this._relativeOffsetY=parseInt(a5);
}
TrPanelPopup.prototype.getRelativeOffsetY=function()
{
return(this._relativeOffsetY)?this._relativeOffsetY:0;
}
TrPanelPopup.prototype.isVisible=function()
{
return this._visible;
}
TrPanelPopup.prototype.returnValue=undefined;
TrPanelPopup.prototype.callback=undefined;
TrPanelPopup.prototype.callbackProps=undefined;
TrPanelPopup.prototype.show=function(a6)
{
if(!this.getContent())
return;
if(_pprBlocking)
return;
if(this.isVisible())
return;
this._calcPosition(a6);
if(this.isModal())
TrPanelPopup._showMask();
TrPanelPopup._showIeIframe();
this.getContent().style.visibility="visible";
this._visible=true;
}
TrPanelPopup.prototype.hide=function(a7)
{
if(!this.getContent())
return;
if(this.isModal())
TrPanelPopup._hideMask();
TrPanelPopup._hideIeIframe();
this.getContent().style.visibility="hidden";
this.getContent().style.left="0px";
this.getContent().style.top="0px";
if(this.callback)
{
try
{
this.callback(this.callbackProps,this.returnValue);
}
catch(ex)
{
alert("Error calling TrPanelPopup callback function:\n"+ex);
}
}
this._visible=false;
var a8=TrPanelPopup._VISIBLE_POPUPS;
if(a8)
delete a8[this.getContent().id];
}
TrPanelPopup.prototype.setSize=function(a9,a10)
{
if(a9)
{
var a11=parseInt(a9);
if(a11>0)
this.getContent().style.width=a11+"px";
}
if(a10)
{
var a11=parseInt(a10);
if(a11>0)
this.getContent().style.height=a11+"px";
}
}
TrPanelPopup._mask=undefined;
TrPanelPopup._showMask=function()
{
if(!TrPanelPopup._mask)
{
TrPanelPopup._mask=document.createElement('div');
TrPanelPopup._mask.name="TrPanelPopup._BlockingModalDiv";
TrPanelPopup._mask.id="af_dialog_blocked-area";
var a12=TrPage.getInstance();
TrPanelPopup._mask.className=a12.getStyleClass("af|dialog::blocked-area");
var a13="display:none;position: absolute; z-index: 5000;top: 0px;left: 0px;cursor: not-allowed;";
if(_agent.isIE&&_agent.version==7)
a13=a13+"background-color: white; filter: alpha(opacity=0);";
else
a13=a13+"background-color: transparent";
TrPanelPopup._mask.style.cssText=a13;
TrPanelPopup._mask.innerHTML="&nbsp;";
document.body.appendChild(TrPanelPopup._mask);
}
TrPanelPopup._registerMaskEvents();
TrPanelPopup._setMaskSize();
TrPanelPopup._mask.style.display="block";
}
TrPanelPopup._registerMaskEvents=function()
{
_addEvent(TrPanelPopup._mask,"click",TrPanelPopup._consumeMaskEvent);
_addEvent(window,"resize",TrPanelPopup._setMaskSize);
_addEvent(window,"scroll",TrPanelPopup._setMaskSize);
}
TrPanelPopup._hideMask=function()
{
_removeEvent(TrPanelPopup._mask,"click",TrPanelPopup._consumeMaskEvent);
_removeEvent(window,"resize",TrPanelPopup._setMaskSize);
_removeEvent(window,"scroll",TrPanelPopup._setMaskSize);
TrPanelPopup._mask.style.display="none";
}
TrPanelPopup.prototype._hitTest=function(a14,a15)
{
var a16=TrUIUtils._getElementBounds(a14);
return a16.x<=a15.pageX&&(a16.x+a16.w)>=a15.pageX&&
a16.y<=a15.pageY&&(a16.y+a16.h)>=a15.pageY;
}
TrPanelPopup.prototype._fitOnScreen=function(a17,a18)
{
var a19=TrUIUtils._getStyle(a17,'visibility');
a17.style.visibility='hidden';
var a20=TrUIUtils._getElementBounds(a17);
var a21=TrUIUtils._getElementLocation(a17.offsetParent);
var a22=TrUIUtils._getStyle(a17.offsetParent,'position');
var a23;
if(a22=='relative'||a22=='absolute')
{
a23={left:a21.x,top:a21.y};
}
else
{
a23={left:0,top:0};
}
var a24={
x:a20.x-(document.body.scrollLeft||document.documentElement.scrollLeft),
y:a20.y-(document.body.scrollTop||document.documentElement.scrollTop)
};
if(a20.x<0)
{
a17.style.left=(0-a23.left)+'px';
}
else if(a24.x+a20.w>a18.w)
{
a17.style.left=(a17.offsetLeft-(a24.x+a20.w-a18.w))+'px';
}
if(a20.y<0)
{
a17.style.top=(0-a23.top)+'px';
}
else if(a24.y+a20.h>a18.h)
{
a17.style.top=(a17.offsetTop-(a24.y+a20.h-a18.h))+'px';
}
a17.style.visibility=a19;
}
TrPanelPopup.prototype._getEventPosition=function(a25)
{
var a26={
clientX:a25.clientX,
clientY:a25.clientY,
pageX:a25.pageX,
pageY:a25.pageY
};
if(a26.pageX==null)
{
a26.pageX=a25.clientX
+(document.body.scrollLeft||document.documentElement.scrollLeft);
a26.pageY=a25.clientY
+(document.body.scrollTop||document.documentElement.scrollTop);
}
return a26;
}
TrPanelPopup.prototype._centerOnScreen=function(a27,a28)
{
a27.style.position='absolute';
var a29=TrUIUtils._getStyle(a27,'visibility');
a27.style.visibility='hidden';
var a30=TrUIUtils._getElementLocation(a27.offsetParent);
var a31=TrUIUtils._getElementBounds(a27);
var a32=TrUIUtils._getStyle(a27.offsetParent,'position');
var a33;
if(a32=='relative'||a32=='absolute')
{
a33={left:a30.x,top:a30.y};
}
else
{
a33={left:0,top:0};
}
var a34={
x:a31.x-(document.body.scrollLeft||document.documentElement.scrollLeft),
y:a31.y-(document.body.scrollTop||document.documentElement.scrollTop)
};
a27.style.left=Math.max(0,
(a28.w/2-a27.clientWidth/2)
-a33.left
+(a31.x-a34.x))+'px';
a27.style.top=Math.max(0,
(a28.h/2-a27.clientHeight/2)
-a33.top
+(a31.y-a34.y))+'px';
a27.style.visibility=a29;
}
TrPanelPopup.prototype._getOffsetParent=function()
{
for(var a35=this.getContent();a35!=null;
a35=a35.parentNode)
{
if(a35.tagName&&'form'==a35.tagName.toLowerCase())
{
return a35;
}
}
return document.body;
}
TrPanelPopup.prototype._calcPosition=function(a36)
{
var a37=this.getContent();
a36=window.event||a36;
var a38=this._getOffsetParent();
var a39=TrUIUtils._getWindowClientSize();
if(!a37.origParent)
{
a37.origParent=a37.parentNode;
}
a38.appendChild(a37);
if(!this._centered)
{
var a40=this._getEventPosition(a36);
var a41=TrUIUtils._getElementLocation(a37.offsetParent);
var a42=TrUIUtils._getStyle(a37.offsetParent,'position');
var a43;
if(a42=='relative'||a42=='absolute')
{
a43={left:a41.x,top:a41.y};
}
else
{
a43={left:0,top:0};
}
a37.style.left=(a40.pageX-a43.left+this.getRelativeOffsetX()-
this._getSideOffset(a37,"Left"))+'px';
a37.style.top=(a40.pageY-a43.top+this.getRelativeOffsetY()-
this._getSideOffset(a37,"Top"))+'px';
}
if(this._centered)
{
this._centerOnScreen(a37,a39);
}
else
{
this._fitOnScreen(a37,a39);
}
if(!this.isModal())
{
var a44=TrUIUtils._getElementBounds(a37);
TrPanelPopup._resizeIeIframe(a44.x,a44.y,a44.w,a44.h);
}
}
TrPanelPopup.prototype._getSideOffset=function(a45,a46)
{
var a47=["border","padding","margin"];
var a48=0;
for(var a49=0;a49<a47.length;++a49)
{
var a50=TrUIUtils._getStyle(a45,a47[a49]+a46);
a50=parseInt(a50);
if(!isNaN(a50))
{
a48+=a50;
}
}
return a48;
}
TrPanelPopup._consumeMaskEvent=function(a51)
{
return false;
}
TrPanelPopup._setMaskSize=function()
{
if(!TrPanelPopup._mask)
return;
var a52=TrUIUtils._getWindowClientSize();
var a53=document.documentElement.scrollWidth||document.body.scrollWidth;
var a54=document.documentElement.scrollHeight||document.body.scrollHeight;
var a55=Math.max(a52.w,a53);
var a56=Math.max(a52.h,a54);
TrPanelPopup._mask.style.width=a55+"px";
TrPanelPopup._mask.style.height=a56+"px";
TrPanelPopup._resizeIeIframe(0,0,a55,a56);
}
TrPanelPopup._showIeIframe=function()
{
if(_agent.isIE&&_agent.version<7)
{
TrPanelPopup._initIeIframe();
TrPanelPopup._maskIframe.style.display="block";
}
}
TrPanelPopup._hideIeIframe=function()
{
if(_agent.isIE&&_agent.version<7)
{
TrPanelPopup._initIeIframe();
TrPanelPopup._maskIframe.style.display="none";
}
}
TrPanelPopup._resizeIeIframe=function(a57,a58,a59,a60)
{
if(_agent.isIE&&_agent.version<7)
{
TrPanelPopup._initIeIframe();
TrPanelPopup._maskIframe.style.left=a57;
TrPanelPopup._maskIframe.style.top=a58;
TrPanelPopup._maskIframe.style.width=a59;
TrPanelPopup._maskIframe.style.height=a60;
}
}
TrPanelPopup._initIeIframe=function()
{
if(!TrPanelPopup._maskIframe)
{
TrPanelPopup._maskIframe=document.createElement('iframe');
TrPanelPopup._maskIframe.name="TrPanelPopup._ieOnlyZIndexIframe";
TrPanelPopup._maskIframe.style.cssText="display: none; left: 0px; position: absolute; top: 0px; z-index: 4999;";
TrPanelPopup._maskIframe.style.filter="progid:DXImageTransform.Microsoft.Alpha(style=0,opacity=0)";
if(_agent.isIE)
{
TrPanelPopup._maskIframe.src="javascript:false;";
}
document.body.appendChild(TrPanelPopup._maskIframe);
}
}
function TrHoverPopup()
{
TrPanelPopup.call(this);
this._hoverCallbackFunction=TrUIUtils.createCallback(this,this.hidePopup);
}
TrHoverPopup.prototype=new TrPanelPopup();
TrHoverPopup.prototype.showPopup=function(a0)
{
_addEvent(document.body,"mousemove",this._hoverCallbackFunction);
this.show(a0);
}
TrHoverPopup.prototype.hidePopup=function(a1)
{
a1=window.event||a1;
var a2=this.getContent();
var a3=this.getTrigger();
var a4=this._getEventPosition(a1);
if((this._hitTest(a2,a4)||
this._hitTest(a3,a4)))
{
return;
}
_removeEvent(document.body,"mousemove",this._hoverCallbackFunction);
this.hide(a1);
if(a2.origParent)
{
a2.origParent.appendChild(a2);
}
}
TrHoverPopup.prototype.isModal=function()
{
return false;
}
function TrClickPopup()
{
TrPanelPopup.call(this);
this._clickCallbackFunction=TrUIUtils.createCallback(this,this.hidePopup);
}
TrClickPopup.prototype=new TrPanelPopup();
TrClickPopup.prototype.showPopup=function(a0)
{
if(!this.isModal())
_addEvent(document,"click",this._clickCallbackFunction);
this.show(a0);
}
TrClickPopup.prototype.hidePopup=function(a1)
{
a1=window.event||a1;
var a2=a1.target||a1.srcElement;
while(a2)
{
if(a2==this.getContent()||
a2==this.getTrigger())
{
break;
}
a2=a2.parentNode;
}
if(!a2)
{
_removeEvent(document,"click",this._clickCallbackFunction);
this.hide(a1);
if(this.getContent().origParent)
{
this.getContent().origParent.appendChild(this.getContent());
}
}
}
