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
package org.apache.myfaces.trinidad.component.core;

import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.component.UIXPoll;
import org.apache.myfaces.trinidad.util.ComponentUtils;

/**
 *
 * <html:p>         
 *           The poll element triggers an event after the time interval 
 *           specified by the interval attribute (in milliseconds).
 *           On the server, the <code>org.apache.myfaces.trinidad.event.PollEvent</code>
 *           is queued and the listeners get a chance to update the model,
 *           refresh components, or even display a dialog in response to
 *           this event.  The components that have listed this poll
 *           component as a partiaTrigger get a chance to re-render themselves.
 *           The poll component automatically uses Partial Page Rendering
 *           (PPR) if available.
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
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.PollEvent</code></td>
 * <td valign="top" nowrap>Apply Request Values<br>Invoke Application</td>
 * <td valign="top">Event delivered when the poll component polls the server.</td>
 * </tr>
 * <tr class="TableRowColor">
 * <td valign="top"><code>org.apache.myfaces.trinidad.event.AttributeChangeEvent</code></td>
 * <td valign="top" nowrap>Invoke Application<br>Apply Request Values</td>
 * <td valign="top">Event delivered to describe an attribute change.  Attribute change events are not delivered for any programmatic change to a property.  They are only delivered when a renderer changes a property without the application's specific request.  An example of an attribute change events might include the width of a column that supported client-side resizing.</td>
 * </tr>
 * </table>
 */
public class CorePoll extends UIXPoll
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXPoll.TYPE);
  static public final PropertyKey INTERVAL_KEY =
    TYPE.registerKey("interval", Integer.class, Integer.valueOf(5000));

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Poll";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.CorePoll";

  /**
   * Construct an instance of the CorePoll.
   */
  public CorePoll()
  {
    super("org.apache.myfaces.trinidad.Poll");
  }

  /**
   * Gets the time between poll events, in milliseconds. 
   *             The default is 5000. If in screen-reader mode, 
   *             make sure the interval is long enough for the
   *             screen reader to read through the re-render before a 
   *             new poll occurs.
   *
   * @return  the new interval value
   */
  final public int getInterval()
  {
    return ComponentUtils.resolveInteger(getProperty(INTERVAL_KEY), 5000);
  }

  /**
   * Sets the time between poll events, in milliseconds. 
   *             The default is 5000. If in screen-reader mode, 
   *             make sure the interval is long enough for the
   *             screen reader to read through the re-render before a 
   *             new poll occurs.
   * 
   * @param interval  the new interval value
   */
  final public void setInterval(int interval)
  {
    setProperty(INTERVAL_KEY, Integer.valueOf(interval));
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
   * Construct an instance of the CorePoll.
   */
  protected CorePoll(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Poll","org.apache.myfaces.trinidad.Poll");
  }
}
