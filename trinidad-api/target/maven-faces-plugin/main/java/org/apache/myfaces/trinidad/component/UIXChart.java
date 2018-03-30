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
package org.apache.myfaces.trinidad.component;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.el.MethodBinding;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.FacesEvent;
import javax.faces.event.PhaseId;
import org.apache.myfaces.trinidad.bean.FacesBean;
import org.apache.myfaces.trinidad.bean.PropertyKey;
import org.apache.myfaces.trinidad.event.ChartDrillDownEvent;
import org.apache.myfaces.trinidad.event.ChartDrillDownListener;

/**
 *
 * <html:p>
 *           The Apache Trinidad Chart is used to display data in a Chart Format.
 *         </html:p>
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
public class UIXChart extends UIXComponentBase
{
  static public final FacesBean.Type TYPE = new FacesBean.Type(
    UIXComponentBase.TYPE);
  static public final PropertyKey VALUE_KEY =
    TYPE.registerKey("value");
  static public final PropertyKey CHART_DRILL_DOWN_LISTENER_KEY =
    TYPE.registerKey("chartDrillDownListener", MethodBinding.class, PropertyKey.CAP_NOT_BOUND | PropertyKey.CAP_STATE_HOLDER);

  static public final String COMPONENT_FAMILY =
    "org.apache.myfaces.trinidad.Chart";
  static public final String COMPONENT_TYPE =
    "org.apache.myfaces.trinidad.Chart";

  /**
   * Construct an instance of the UIXChart.
   */
  public UIXChart()
  {
    super("org.apache.myfaces.trinidad.Chart");
  }
  
  /**
   * Delivers an event to the appropriate listeners.
   * @param event
   * @throws javax.faces.event.AbortProcessingException
   */
	@Override
  public void broadcast(FacesEvent event)
    throws AbortProcessingException
  {

    // Deliver to the default ChartDrillDownEvent
    if (event instanceof ChartDrillDownEvent)
    {
      broadcastToMethodBinding(event, getChartDrillDownListener());
    }
    super.broadcast(event);
  }

  /**
   * Adds a drilldown listener.
   *
   * @param listener  the selection listener to add
   */
  final public void addChartDrillDownListener(
    ChartDrillDownListener listener)
  {
    addFacesListener(listener);
  }

  /**
   * Removes a drilldown listener.
   *
   * @param listener  the selection listener to remove
   */
  final public void removeChartDrillDownListener(
    ChartDrillDownListener listener)
  {
    removeFacesListener(listener);
  }


  /**
   * Gets the data model being used by this component.The specific model class must be derived from 
   *         <code>org.apache.myfaces.trinidad.model.ChartModel</code>. 
   *         The derived class must override the abstract methods to provide the required values for chart display.
   * <p>
   * This is a required property on the component.
   * </p>
   *
   * @return  the new value value
   */
  final public Object getValue()
  {
    return getProperty(VALUE_KEY);
  }

  /**
   * Sets the data model being used by this component.The specific model class must be derived from 
   *         <code>org.apache.myfaces.trinidad.model.ChartModel</code>. 
   *         The derived class must override the abstract methods to provide the required values for chart display.
   * <p>
   * This is a required property on the component.
   * 
   * @param value  the new value value
   */
  final public void setValue(Object value)
  {
    setProperty(VALUE_KEY, (value));
  }

  /**
   * Gets a method reference to a drill down listener that
   *          will be called when the user drills down into the chart data.The method must take a parameter of type <code>org.apache.myfaces.trinidad.event.ChartDrillDownEvent</code>.
   *
   * @return  the new chartDrillDownListener value
   */
  final public MethodBinding getChartDrillDownListener()
  {
    return (MethodBinding)getProperty(CHART_DRILL_DOWN_LISTENER_KEY);
  }

  /**
   * Sets a method reference to a drill down listener that
   *          will be called when the user drills down into the chart data.The method must take a parameter of type <code>org.apache.myfaces.trinidad.event.ChartDrillDownEvent</code>.
   * 
   * @param chartDrillDownListener  the new chartDrillDownListener value
   */
  final public void setChartDrillDownListener(MethodBinding chartDrillDownListener)
  {
    setProperty(CHART_DRILL_DOWN_LISTENER_KEY, (chartDrillDownListener));
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
   * Construct an instance of the UIXChart.
   */
  protected UIXChart(
    String rendererType
    )
  {
    super(rendererType);
  }

  static
  {
    TYPE.lockAndRegister("org.apache.myfaces.trinidad.Chart","org.apache.myfaces.trinidad.Chart");
  }
}
