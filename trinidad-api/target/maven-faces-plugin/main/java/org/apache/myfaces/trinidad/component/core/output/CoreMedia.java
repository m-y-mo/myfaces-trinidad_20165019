// WARNING: This file was automatically generated. Do not edit it directly,
//          or you will lose your changes.

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
*/
package org.apache.myfaces.trinidad.component.core.output;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXObject;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>
 *             The media component displays media content, such as audio, video,
 *             or image in a player embedded in the user agent.
 *             The media control displays the media specified by the &quot;source&quot;
 *             attribute in the appropriate media player.  If a particular
 *             media player is desired, it can be specified using the &quot;player&quot;
 *             attribute.  The media control attempts to intelligently handle
 *             two tricky aspects of cross-platform media display--determining
 *             the best player to display the media, and sizing the media player.
 *           </html:p>
 *           <html:p>
 *             The media control attempts to pick the appropriate media player
 *             using the following steps:
 *             <html:ol>
 *               <html:li>
 *                 If the primary MIME type of the content is &quot;image&quot;, the
 *                 built in user-agent support will be used.
 *               </html:li>
 *               <html:li>
 *                 If a media player has been specified by the &quot;player&quot; attribute
 *                 and that player is available on the user agent and can display
 *                 the media resource, that player will be used.
 *               </html:li>
 *               <html:li>
 *                 If one player is especially good at playing the media resource
 *                 and that player is available on the user agent, that player
 *                 will be used.
 *               </html:li>
 *               <html:li>
 *                 If one player is especially dominant on the user agent and that
 *                 player can play the media resource, that player will be used.
 *               </html:li>
 *               <html:li>
 *                 the &quot;link&quot; player will be used.
 *               </html:li>
 *             </html:ol>
 *           </html:p>
 *           <html:p>
 *             The media component supports two approaches to
 *             sizing the media control
 *             setting the &quot;width&quot; and &quot;height&quot; attributes, which specify the
 *             amount of space reserved on the user agent for the media control,
 *             and setting the &quot;innerWidth&quot; and &quot;innerHeight&quot; attributes, which
 *             specify the size of the media resource content.  Since it is almost
 *             impossible to determine the correct width and height to use across
 *             different players and different player control configurations,
 *             specifying the &quot;innerWidth&quot; and &quot;innerHeight&quot; is the recommended
 *             strategy.
 *           </html:p>
 *           <html:p>
 *             If the size of the media control isn't specified by one of the above
 *             approaches, a default inner size, determined by the content type of
 *             the media resource, will be used.  This works well for audio content,
 *             but can cause content to be clipped or occupy too much space for
 *             video content.
 *           </html:p>
 *
 * <h4>Events:</h4>
 * <table border="1" width="100%" cellpadding="3" summary="">
 * <tr bgcolor="#CCCCFF" class="TableHeadingColor">
 * <th align="left">Type</th>
 * <th align="left">Phases</th>
 * <th align="left">Description</th>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CoreMedia extends UIXObject
{
  static public final String PLAYER_WINDOWS = "windows";
  static public final String PLAYER_QUICKTIME = "quicktime";
  static public final String PLAYER_LINK = "link";
  static public final String PLAYER_REAL = "real";
  static public final String CONTROLS_NONE_VISIBLE = "noneVisible";
  static public final String CONTROLS_NONE = "none";
  static public final String CONTROLS_TYPICAL = "typical";
  static public final String CONTROLS_ALL = "all";
  static public final String CONTROLS_MINIMAL = "minimal";
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXObject.TYPE);
  static public final PropertyKey WIDTH_KEY =
    TYPE.registerKey("width", String.class);
  static public final PropertyKey HEIGHT_KEY =
    TYPE.registerKey("height", String.class);
  static public final PropertyKey INNER_WIDTH_KEY =
    TYPE.registerKey("innerWidth", Integer.class);
  static public final PropertyKey INNER_HEIGHT_KEY =
    TYPE.registerKey("innerHeight", Integer.class);
  static public final PropertyKey SOURCE_KEY =
    TYPE.registerKey("source", String.class);
  static public final PropertyKey AUTOSTART_KEY =
    TYPE.registerKey("autostart", Boolean.class, Boolean.FALSE);
  static public final PropertyKey PLAY_COUNT_KEY =
    TYPE.registerKey("playCount", Integer.class);
  static public final PropertyKey CONTENT_TYPE_KEY =
    TYPE.registerKey("contentType", String.class);
  static public final PropertyKey STANDBY_TEXT_KEY =
    TYPE.registerKey("standbyText", String.class);
  static public final PropertyKey PLAYER_KEY =
    TYPE.registerKey("player", String.class);
  static public final PropertyKey CONTROLS_KEY =
    TYPE.registerKey("controls", String.class, "typical");
  static public final PropertyKey INLINE_STYLE_KEY =
    TYPE.registerKey("inlineStyle", String.class);
  static public final PropertyKey STYLE_CLASS_KEY =
    TYPE.registerKey("styleClass", String.class);
  static public final PropertyKey SHORT_DESC_KEY =
    TYPE.registerKey("shortDesc", String.class);
  static public final PropertyKey PARTIAL_TRIGGERS_KEY =
    TYPE.registerKey("partialTriggers", String[].class);
  static public final PropertyKey ONCLICK_KEY =
    TYPE.registerKey("onclick", String.class);
  static public final PropertyKey ONDBLCLICK_KEY =
    TYPE.registerKey("ondblclick", String.class);
  static public final PropertyKey ONMOUSEDOWN_KEY =
    TYPE.registerKey("onmousedown", String.class);
  static public final PropertyKey ONMOUSEUP_KEY =
    TYPE.registerKey("onmouseup", String.class);
  static public final PropertyKey ONMOUSEOVER_KEY =
    TYPE.registerKey("onmouseover", String.class);
  static public final PropertyKey ONMOUSEMOVE_KEY =
    TYPE.registerKey("onmousemove", String.class);
  static public final PropertyKey ONMOUSEOUT_KEY =
    TYPE.registerKey("onmouseout", String.class);
  static public final PropertyKey ONKEYPRESS_KEY =
    TYPE.registerKey("onkeypress", String.class);
  static public final PropertyKey ONKEYDOWN_KEY =
    TYPE.registerKey("onkeydown", String.class);
  static public final PropertyKey ONKEYUP_KEY =
    TYPE.registerKey("onkeyup", String.class);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Object";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CoreMedia";

  /**
   * Construct an instance of the CoreMedia.
   */
  public CoreMedia()
  {
    super("org.apache.myfaces.trinidad.Media");
  }

  /**
   * Gets <html> width in pixels to reserve for the media player plus its content.
   *             As the extra width needed for the media player controls can vary
   *             from media player to media player and depend on the controls
   *             displayed in the media player, it is recommended that the
   *             "innerWidth" attribute be used in preference to this attribute.
   *             <p>
   *             If both the "width" and "innerWidth" attributes are specified,
   *             the "width" attribute will be used.
   *             </p>
   *             <p>
   *             If no width is specified, the width of the media control is
   *             determined by calculating the "innerWidth" and adding any extra
   *             width necessary to display the media player controls.
   *             </p></html>
   *
   * @return  the new width value
   */
  final public String getWidth()
  {
    return ComponentUtils.resolveString(getProperty(WIDTH_KEY));
  }

  /**
   * Sets <html> width in pixels to reserve for the media player plus its content.
   *             As the extra width needed for the media player controls can vary
   *             from media player to media player and depend on the controls
   *             displayed in the media player, it is recommended that the
   *             "innerWidth" attribute be used in preference to this attribute.
   *             <p>
   *             If both the "width" and "innerWidth" attributes are specified,
   *             the "width" attribute will be used.
   *             </p>
   *             <p>
   *             If no width is specified, the width of the media control is
   *             determined by calculating the "innerWidth" and adding any extra
   *             width necessary to display the media player controls.
   *             </p></html>
   * 
   * @param width  the new width value
   */
  final public void setWidth(String width)
  {
    setProperty(WIDTH_KEY, (width));
  }

  /**
   * Sets <html> width in pixels to reserve for the media player plus its content.
   *             As the extra width needed for the media player controls can vary
   *             from media player to media player and depend on the controls
   *             displayed in the media player, it is recommended that the
   *             "innerWidth" attribute be used in preference to this attribute.
   *             <p>
   *             If both the "width" and "innerWidth" attributes are specified,
   *             the "width" attribute will be used.
   *             </p>
   *             <p>
   *             If no width is specified, the width of the media control is
   *             determined by calculating the "innerWidth" and adding any extra
   *             width necessary to display the media player controls.
   *             </p></html>
   * 
   * @param width  the new width value
   */
  final public void setWidth(int width)
  {
    setProperty(WIDTH_KEY, Integer.valueOf(width));
  }

  /**
   * Gets <html> height in pixels to reserve for the media player plus its content.
   *             As the extra height needed for the media player controls can vary
   *             from media player to media player and depend on the controls
   *             displayed in the media player, it is recommended that the
   *             "innerHeight" attribute be used in preference to this attribute.
   *             <p>
   *             If both the "height" and "innerHeight" attributes are specified,
   *             the "height" attribute will be used.
   *             </p>
   *             <p>
   *             If no height is specified, the height of the media control is
   *             determined by calculating the "innerHeight" and adding any extra
   *             height necessary to display the media player controls.
   *             </p></html>
   *
   * @return  the new height value
   */
  final public String getHeight()
  {
    return ComponentUtils.resolveString(getProperty(HEIGHT_KEY));
  }

  /**
   * Sets <html> height in pixels to reserve for the media player plus its content.
   *             As the extra height needed for the media player controls can vary
   *             from media player to media player and depend on the controls
   *             displayed in the media player, it is recommended that the
   *             "innerHeight" attribute be used in preference to this attribute.
   *             <p>
   *             If both the "height" and "innerHeight" attributes are specified,
   *             the "height" attribute will be used.
   *             </p>
   *             <p>
   *             If no height is specified, the height of the media control is
   *             determined by calculating the "innerHeight" and adding any extra
   *             height necessary to display the media player controls.
   *             </p></html>
   * 
   * @param height  the new height value
   */
  final public void setHeight(String height)
  {
    setProperty(HEIGHT_KEY, (height));
  }

  /**
   * Sets <html> height in pixels to reserve for the media player plus its content.
   *             As the extra height needed for the media player controls can vary
   *             from media player to media player and depend on the controls
   *             displayed in the media player, it is recommended that the
   *             "innerHeight" attribute be used in preference to this attribute.
   *             <p>
   *             If both the "height" and "innerHeight" attributes are specified,
   *             the "height" attribute will be used.
   *             </p>
   *             <p>
   *             If no height is specified, the height of the media control is
   *             determined by calculating the "innerHeight" and adding any extra
   *             height necessary to display the media player controls.
   *             </p></html>
   * 
   * @param height  the new height value
   */
  final public void setHeight(int height)
  {
    setProperty(HEIGHT_KEY, Integer.valueOf(height));
  }

  /**
   * Gets <html> width in pixels to reserve for the media player content.  This
   *             will typically be set to the pixel width of the media resource
   *             to display.
   *             <p>
   *             If no "innerWidth" is specified, the "innerWidth" will be defaulted
   *             based on the content type of the media resource to play.
   *             </p>
   *             <p>
   *             If both the "width" and "innerWidth" attributes are specified,
   *             the "width" attribute will be used.
   *             </p></html>
   *
   * @return  the new innerWidth value
   */
  final public int getInnerWidth()
  {
    return ComponentUtils.resolveInteger(getProperty(INNER_WIDTH_KEY));
  }

  /**
   * Sets <html> width in pixels to reserve for the media player content.  This
   *             will typically be set to the pixel width of the media resource
   *             to display.
   *             <p>
   *             If no "innerWidth" is specified, the "innerWidth" will be defaulted
   *             based on the content type of the media resource to play.
   *             </p>
   *             <p>
   *             If both the "width" and "innerWidth" attributes are specified,
   *             the "width" attribute will be used.
   *             </p></html>
   * 
   * @param innerWidth  the new innerWidth value
   */
  final public void setInnerWidth(int innerWidth)
  {
    setProperty(INNER_WIDTH_KEY, Integer.valueOf(innerWidth));
  }

  /**
   * Gets <html> height in pixels to reserve for the media player content.  This
   *             will typically be set to the pixel height of the media resource
   *             to display.
   *             <p>
   *             If no "innerHeight" is specified, the "innerHeight" will be defaulted
   *             based on the content type of the media resource to play.
   *             </p>
   *             <p>
   *             If both the "height" and "innerHeight" attributes are specified,
   *             the "height" attribute will be used.
   *             </p></html>
   *
   * @return  the new innerHeight value
   */
  final public int getInnerHeight()
  {
    return ComponentUtils.resolveInteger(getProperty(INNER_HEIGHT_KEY));
  }

  /**
   * Sets <html> height in pixels to reserve for the media player content.  This
   *             will typically be set to the pixel height of the media resource
   *             to display.
   *             <p>
   *             If no "innerHeight" is specified, the "innerHeight" will be defaulted
   *             based on the content type of the media resource to play.
   *             </p>
   *             <p>
   *             If both the "height" and "innerHeight" attributes are specified,
   *             the "height" attribute will be used.
   *             </p></html>
   * 
   * @param innerHeight  the new innerHeight value
   */
  final public void setInnerHeight(int innerHeight)
  {
    setProperty(INNER_HEIGHT_KEY, Integer.valueOf(innerHeight));
  }

  /**
   * Gets the URI specifying the location of the media resource.  If no
   *             contentType is specified, the contentType will be inferred from
   *             the extension of the source attribute.
   *
   * @return  the new source value
   */
  final public String getSource()
  {
    return ComponentUtils.resolveString(getProperty(SOURCE_KEY));
  }

  /**
   * Sets the URI specifying the location of the media resource.  If no
   *             contentType is specified, the contentType will be inferred from
   *             the extension of the source attribute.
   * 
   * @param source  the new source value
   */
  final public void setSource(String source)
  {
    setProperty(SOURCE_KEY, (source));
  }

  /**
   * Gets a boolean value that controls whether the media resource loads
   *             and plays automatically without user initiation.  When set to "true",
   *             the media resource will load and play as soon as possible.
   *
   * @return  the new autostart value
   */
  final public boolean isAutostart()
  {
    return ComponentUtils.resolveBoolean(getProperty(AUTOSTART_KEY), false);
  }

  /**
   * Sets a boolean value that controls whether the media resource loads
   *             and plays automatically without user initiation.  When set to "true",
   *             the media resource will load and play as soon as possible.
   * 
   * @param autostart  the new autostart value
   */
  final public void setAutostart(boolean autostart)
  {
    setProperty(AUTOSTART_KEY, autostart ? Boolean.TRUE : Boolean.FALSE);
  }

  /**
   * Gets the number of times the media resource will play.  If set to "0",
   *             the resource will loop until the user stops the playing.
   *
   * @return  the new playCount value
   */
  final public int getPlayCount()
  {
    return ComponentUtils.resolveInteger(getProperty(PLAY_COUNT_KEY));
  }

  /**
   * Sets the number of times the media resource will play.  If set to "0",
   *             the resource will loop until the user stops the playing.
   * 
   * @param playCount  the new playCount value
   */
  final public void setPlayCount(int playCount)
  {
    setProperty(PLAY_COUNT_KEY, Integer.valueOf(playCount));
  }

  /**
   * Gets the MIME type of the media content returned by the "source" URI.
   *             This attribute is used as a hint when determining which player to
   *             pick, how the controls of the player are to be configured, and
   *             the default size of the media player.  If it isn't specified, an
   *             attempt will be made to derive this information from the extension
   *             of the source URI.
   *
   * @return  the new contentType value
   */
  final public String getContentType()
  {
    return ComponentUtils.resolveString(getProperty(CONTENT_TYPE_KEY));
  }

  /**
   * Sets the MIME type of the media content returned by the "source" URI.
   *             This attribute is used as a hint when determining which player to
   *             pick, how the controls of the player are to be configured, and
   *             the default size of the media player.  If it isn't specified, an
   *             attempt will be made to derive this information from the extension
   *             of the source URI.
   * 
   * @param contentType  the new contentType value
   */
  final public void setContentType(String contentType)
  {
    setProperty(CONTENT_TYPE_KEY, (contentType));
  }

  /**
   * Gets Message to display in the media player while the media resource
   *               is loading.
   *
   * @return  the new standbyText value
   */
  final public String getStandbyText()
  {
    return ComponentUtils.resolveString(getProperty(STANDBY_TEXT_KEY));
  }

  /**
   * Sets Message to display in the media player while the media resource
   *               is loading.
   * 
   * @param standbyText  the new standbyText value
   */
  final public void setStandbyText(String standbyText)
  {
    setProperty(STANDBY_TEXT_KEY, (standbyText));
  }

  /**
   * Gets <html> which media player to use to play the media resource. If possible,
   *               the media control will accomodate this request.  However, if
   *               the requested player is not available on the user agent, or does
   *               not support playing the media resource, an alternate player
   *               will be used instead.  In all cases, the "link" player is used
   *               as a fallback if no other player is available, or the requested
   *               player fails for some reason.
   *               <ul>
   *                 <li>
   *                   <code>"none"</code>
   *                   <p>
   *                    use a link in the user agent page to launch the playing of the
   *                    media resource.
   *                   </p>
   *                   <p>
   *                    This player setting uses the least amount of space on the page
   *                    and uses the user agent's built in content type mapping
   *                    to determine how to display the media resource.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"quicktime"</code>
   *                   <p>
   *                    use the Apple QuickTime player.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"windows"</code>
   *                   <p>
   *                    use the Windows Media Player.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"real"</code>
   *                   <p>
   *                    use the Real Player.
   *                   </p>
   *                 </li>
   *               </ul></html>
   *
   * @return  the new player value
   */
  final public String getPlayer()
  {
    return ComponentUtils.resolveString(getProperty(PLAYER_KEY));
  }

  /**
   * Sets <html> which media player to use to play the media resource. If possible,
   *               the media control will accomodate this request.  However, if
   *               the requested player is not available on the user agent, or does
   *               not support playing the media resource, an alternate player
   *               will be used instead.  In all cases, the "link" player is used
   *               as a fallback if no other player is available, or the requested
   *               player fails for some reason.
   *               <ul>
   *                 <li>
   *                   <code>"none"</code>
   *                   <p>
   *                    use a link in the user agent page to launch the playing of the
   *                    media resource.
   *                   </p>
   *                   <p>
   *                    This player setting uses the least amount of space on the page
   *                    and uses the user agent's built in content type mapping
   *                    to determine how to display the media resource.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"quicktime"</code>
   *                   <p>
   *                    use the Apple QuickTime player.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"windows"</code>
   *                   <p>
   *                    use the Windows Media Player.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"real"</code>
   *                   <p>
   *                    use the Real Player.
   *                   </p>
   *                 </li>
   *               </ul></html>
   * 
   * @param player  the new player value
   */
  final public void setPlayer(String player)
  {
    setProperty(PLAYER_KEY, (player));
  }

  /**
   * Gets <html> the set of controls made available to the user for controlling
   *               the media playback.  The actual set of controls displayed for the
   *               same value may differ between players.  Likewise, the amount of
   *               space occupied by the controls will differ from media player to
   *               media player.  This can cause problems if the size of the
   *               media control has been specified by the "width" and "height"
   *               attributes rather than "innerWidth" and "innerHeight".
   *               <ul>
   *                 <li>
   *                   <code>"none"</code>
   *                   <p>
   *                    don't show any controls for the media player and don't allow
   *                    control access through alternate means, such as context menus.
   *                   </p>
   *                   <p>
   *                    This value is typically only used in kiosk-type applications
   *                    where no user control over the playing of the media is allowed.
   *                    It is typically used in conjunction with setting the
   *                    "autostart" attribute to "true", and the "playCount" attribute
   *                    to "0" to cause the media play immediately and then loop.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"noneVisible"</code>
   *                   <p>
   *                    don't show any controls for the media player but allow control
   *                    access through alternate means, such as context menus.
   *                   </p>
   *                   <p>
   *                    This value is typically only used in applications where user
   *                    control over the playing of the media is allowed, but
   *                    not encouraged.  It is typically used in conjunction with
   *                    setting the "autostart" attribute to "true", and the
   *                    "playCount" attribute to "0" to cause the media to play
   *                    immediately and then loop.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"minimal"</code>
   *                   <p>
   *                     show a minimal set of controls for playing media on the media
   *                     player.
   *                   </p>
   *                   <p>
   *                    This value gives users control over the most
   *                    important media playing controls, while occupying the least
   *                    amount of additional space on the user agent.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"typical"</code>
   *                   <p>
   *                    show the typical set of controls for playing media on the
   *                    media player.
   *                   </p>
   *                   <p>
   *                    This value, the default, gives users control over the most
   *                    common media playing controls, without occupying an inordinate
   *                    amount of extra space on the user agent.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"all"</code>
   *                   <p>
   *                    Show all available controls for playing media on the media player
   *                   </p>
   *                   <p>
   *                    Using this setting can cause large amount of additional space
   *                    to be required, depending on the media player used.
   *                   </p>
   *                 </li>
   *               </ul>
   *               <p>
   *                 The default of this attribute is <code>"typical"</code>.
   *               </p></html>
   *
   * @return  the new controls value
   */
  final public String getControls()
  {
    return ComponentUtils.resolveString(getProperty(CONTROLS_KEY), "typical");
  }

  /**
   * Sets <html> the set of controls made available to the user for controlling
   *               the media playback.  The actual set of controls displayed for the
   *               same value may differ between players.  Likewise, the amount of
   *               space occupied by the controls will differ from media player to
   *               media player.  This can cause problems if the size of the
   *               media control has been specified by the "width" and "height"
   *               attributes rather than "innerWidth" and "innerHeight".
   *               <ul>
   *                 <li>
   *                   <code>"none"</code>
   *                   <p>
   *                    don't show any controls for the media player and don't allow
   *                    control access through alternate means, such as context menus.
   *                   </p>
   *                   <p>
   *                    This value is typically only used in kiosk-type applications
   *                    where no user control over the playing of the media is allowed.
   *                    It is typically used in conjunction with setting the
   *                    "autostart" attribute to "true", and the "playCount" attribute
   *                    to "0" to cause the media play immediately and then loop.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"noneVisible"</code>
   *                   <p>
   *                    don't show any controls for the media player but allow control
   *                    access through alternate means, such as context menus.
   *                   </p>
   *                   <p>
   *                    This value is typically only used in applications where user
   *                    control over the playing of the media is allowed, but
   *                    not encouraged.  It is typically used in conjunction with
   *                    setting the "autostart" attribute to "true", and the
   *                    "playCount" attribute to "0" to cause the media to play
   *                    immediately and then loop.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"minimal"</code>
   *                   <p>
   *                     show a minimal set of controls for playing media on the media
   *                     player.
   *                   </p>
   *                   <p>
   *                    This value gives users control over the most
   *                    important media playing controls, while occupying the least
   *                    amount of additional space on the user agent.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"typical"</code>
   *                   <p>
   *                    show the typical set of controls for playing media on the
   *                    media player.
   *                   </p>
   *                   <p>
   *                    This value, the default, gives users control over the most
   *                    common media playing controls, without occupying an inordinate
   *                    amount of extra space on the user agent.
   *                   </p>
   *                 </li>
   *                 <li>
   *                   <code>"all"</code>
   *                   <p>
   *                    Show all available controls for playing media on the media player
   *                   </p>
   *                   <p>
   *                    Using this setting can cause large amount of additional space
   *                    to be required, depending on the media player used.
   *                   </p>
   *                 </li>
   *               </ul>
   *               <p>
   *                 The default of this attribute is <code>"typical"</code>.
   *               </p></html>
   * 
   * @param controls  the new controls value
   */
  final public void setControls(String controls)
  {
    setProperty(CONTROLS_KEY, (controls));
  }

  /**
   * Gets the CSS styles to use for this component.
   *
   * @return  the new inlineStyle value
   */
  final public String getInlineStyle()
  {
    return ComponentUtils.resolveString(getProperty(INLINE_STYLE_KEY));
  }

  /**
   * Sets the CSS styles to use for this component.
   * 
   * @param inlineStyle  the new inlineStyle value
   */
  final public void setInlineStyle(String inlineStyle)
  {
    setProperty(INLINE_STYLE_KEY, (inlineStyle));
  }

  /**
   * Gets a CSS style class to use for this component.
   *
   * @return  the new styleClass value
   */
  final public String getStyleClass()
  {
    return ComponentUtils.resolveString(getProperty(STYLE_CLASS_KEY));
  }

  /**
   * Sets a CSS style class to use for this component.
   * 
   * @param styleClass  the new styleClass value
   */
  final public void setStyleClass(String styleClass)
  {
    setProperty(STYLE_CLASS_KEY, (styleClass));
  }

  /**
   * Gets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   *
   * @return  the new shortDesc value
   */
  final public String getShortDesc()
  {
    return ComponentUtils.resolveString(getProperty(SHORT_DESC_KEY));
  }

  /**
   * Sets The short description of the component. This text is commonly used by user agents to display tooltip help text.
   * 
   * @param shortDesc  the new shortDesc value
   */
  final public void setShortDesc(String shortDesc)
  {
    setProperty(SHORT_DESC_KEY, (shortDesc));
  }

  /**
   * Gets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   *
   * @return  the new partialTriggers value
   */
  final public String[] getPartialTriggers()
  {
    return (String[])getProperty(PARTIAL_TRIGGERS_KEY);
  }

  /**
   * Sets the IDs of the components that should trigger a partial update.
   *         <p>
   *         This component will listen on the trigger components. If one of the
   *         trigger components receives an event that will cause it to update
   *         in some way, this component will request to be updated too.</p>
   *         <p>
   *         Separate multiple triggers with a space. e.g., partialTriggers="cmp1 cmp2"
   *         </p>
   *         <p>
   *         Identifiers must account for NamingContainers.  You can use a single colon to start the search from the root,
   *         or use multiple colons to move up through the NamingContainer. For example,
   *         "::" will pop out of this component's naming container (it pops out of itself if it is a naming container), 
   *         ":::" will pop out of two naming containers, etc. The search for
   *         the partialTrigger begins from there. e.g., partialTriggers=":::commandButton1" the search begins for the 
   *         component with id = commandButton1 after popping out of two naming containers relative to this component.
   *         To go into naming containers, you separate the naming containers with ':', e.g.,partialTriggers= "nc1:nc2:nc3:componentId".</p>
   * 
   * @param partialTriggers  the new partialTriggers value
   */
  final public void setPartialTriggers(String[] partialTriggers)
  {
    setProperty(PARTIAL_TRIGGERS_KEY, (partialTriggers));
  }

  /**
   * Gets an onclick Javascript handler.
   *
   * @return  the new onclick value
   */
  final public String getOnclick()
  {
    return ComponentUtils.resolveString(getProperty(ONCLICK_KEY));
  }

  /**
   * Sets an onclick Javascript handler.
   * 
   * @param onclick  the new onclick value
   */
  final public void setOnclick(String onclick)
  {
    setProperty(ONCLICK_KEY, (onclick));
  }

  /**
   * Gets an ondblclick Javascript handler.
   *
   * @return  the new ondblclick value
   */
  final public String getOndblclick()
  {
    return ComponentUtils.resolveString(getProperty(ONDBLCLICK_KEY));
  }

  /**
   * Sets an ondblclick Javascript handler.
   * 
   * @param ondblclick  the new ondblclick value
   */
  final public void setOndblclick(String ondblclick)
  {
    setProperty(ONDBLCLICK_KEY, (ondblclick));
  }

  /**
   * Gets an onmousedown Javascript handler.
   *
   * @return  the new onmousedown value
   */
  final public String getOnmousedown()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEDOWN_KEY));
  }

  /**
   * Sets an onmousedown Javascript handler.
   * 
   * @param onmousedown  the new onmousedown value
   */
  final public void setOnmousedown(String onmousedown)
  {
    setProperty(ONMOUSEDOWN_KEY, (onmousedown));
  }

  /**
   * Gets an onmouseup Javascript handler.
   *
   * @return  the new onmouseup value
   */
  final public String getOnmouseup()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEUP_KEY));
  }

  /**
   * Sets an onmouseup Javascript handler.
   * 
   * @param onmouseup  the new onmouseup value
   */
  final public void setOnmouseup(String onmouseup)
  {
    setProperty(ONMOUSEUP_KEY, (onmouseup));
  }

  /**
   * Gets an onmouseover Javascript handler.
   *
   * @return  the new onmouseover value
   */
  final public String getOnmouseover()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOVER_KEY));
  }

  /**
   * Sets an onmouseover Javascript handler.
   * 
   * @param onmouseover  the new onmouseover value
   */
  final public void setOnmouseover(String onmouseover)
  {
    setProperty(ONMOUSEOVER_KEY, (onmouseover));
  }

  /**
   * Gets an onmousemove Javascript handler.
   *
   * @return  the new onmousemove value
   */
  final public String getOnmousemove()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEMOVE_KEY));
  }

  /**
   * Sets an onmousemove Javascript handler.
   * 
   * @param onmousemove  the new onmousemove value
   */
  final public void setOnmousemove(String onmousemove)
  {
    setProperty(ONMOUSEMOVE_KEY, (onmousemove));
  }

  /**
   * Gets an onmouseout Javascript handler.
   *
   * @return  the new onmouseout value
   */
  final public String getOnmouseout()
  {
    return ComponentUtils.resolveString(getProperty(ONMOUSEOUT_KEY));
  }

  /**
   * Sets an onmouseout Javascript handler.
   * 
   * @param onmouseout  the new onmouseout value
   */
  final public void setOnmouseout(String onmouseout)
  {
    setProperty(ONMOUSEOUT_KEY, (onmouseout));
  }

  /**
   * Gets an onkeypress Javascript handler.
   *
   * @return  the new onkeypress value
   */
  final public String getOnkeypress()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYPRESS_KEY));
  }

  /**
   * Sets an onkeypress Javascript handler.
   * 
   * @param onkeypress  the new onkeypress value
   */
  final public void setOnkeypress(String onkeypress)
  {
    setProperty(ONKEYPRESS_KEY, (onkeypress));
  }

  /**
   * Gets an onkeydown Javascript handler.
   *
   * @return  the new onkeydown value
   */
  final public String getOnkeydown()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYDOWN_KEY));
  }

  /**
   * Sets an onkeydown Javascript handler.
   * 
   * @param onkeydown  the new onkeydown value
   */
  final public void setOnkeydown(String onkeydown)
  {
    setProperty(ONKEYDOWN_KEY, (onkeydown));
  }

  /**
   * Gets an onkeyup Javascript handler.
   *
   * @return  the new onkeyup value
   */
  final public String getOnkeyup()
  {
    return ComponentUtils.resolveString(getProperty(ONKEYUP_KEY));
  }

  /**
   * Sets an onkeyup Javascript handler.
   * 
   * @param onkeyup  the new onkeyup value
   */
  final public void setOnkeyup(String onkeyup)
  {
    setProperty(ONKEYUP_KEY, (onkeyup));
  }

  @Override
  public String getFamily()
  {
    return COMPONENT_FAMILY;
  }

  @Override
  protected FacesBean.Type getBeanType()
  {
    return TYPE;
  }

  /**
   * Construct an instance of the CoreMedia.
   */
  protected CoreMedia(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Object","org.apache.myfaces.trinidad.Media");
  }
}
