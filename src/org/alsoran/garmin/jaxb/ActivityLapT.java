//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.03.31 at 01:48:18 PM EDT 
//


package org.alsoran.garmin.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ActivityLap_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityLap_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTimeSeconds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaximumSpeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Calories" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="AverageHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="MaximumHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="Intensity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity_t"/>
 *         &lt;element name="Cadence" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CadenceValue_t" minOccurs="0"/>
 *         &lt;element name="TriggerMethod" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TriggerMethod_t"/>
 *         &lt;element name="Track" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Track_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StartTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLap_t", propOrder = {
    "totalTimeSeconds",
    "distanceMeters",
    "maximumSpeed",
    "calories",
    "averageHeartRateBpm",
    "maximumHeartRateBpm",
    "intensity",
    "cadence",
    "triggerMethod",
    "track",
    "notes",
    "extensions"
})
public class ActivityLapT {

    @XmlElement(name = "TotalTimeSeconds")
    protected double totalTimeSeconds;
    @XmlElement(name = "DistanceMeters")
    protected double distanceMeters;
    @XmlElement(name = "MaximumSpeed")
    protected Double maximumSpeed;
    @XmlElement(name = "Calories")
    @XmlSchemaType(name = "unsignedShort")
    protected int calories;
    @XmlElement(name = "AverageHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT averageHeartRateBpm;
    @XmlElement(name = "MaximumHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT maximumHeartRateBpm;
    @XmlElement(name = "Intensity", required = true)
    protected IntensityT intensity;
    @XmlElement(name = "Cadence")
    protected Short cadence;
    @XmlElement(name = "TriggerMethod", required = true)
    protected TriggerMethodT triggerMethod;
    @XmlElement(name = "Track")
    protected List<TrackT> track;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;

    /**
     * Gets the value of the totalTimeSeconds property.
     * 
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * Sets the value of the totalTimeSeconds property.
     * 
     */
    public void setTotalTimeSeconds(double value) {
        this.totalTimeSeconds = value;
    }

    /**
     * Gets the value of the distanceMeters property.
     * 
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * Sets the value of the distanceMeters property.
     * 
     */
    public void setDistanceMeters(double value) {
        this.distanceMeters = value;
    }

    /**
     * Gets the value of the maximumSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Sets the value of the maximumSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumSpeed(Double value) {
        this.maximumSpeed = value;
    }

    /**
     * Gets the value of the calories property.
     * 
     */
    public int getCalories() {
        return calories;
    }

    /**
     * Sets the value of the calories property.
     * 
     */
    public void setCalories(int value) {
        this.calories = value;
    }

    /**
     * Gets the value of the averageHeartRateBpm property.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getAverageHeartRateBpm() {
        return averageHeartRateBpm;
    }

    /**
     * Sets the value of the averageHeartRateBpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setAverageHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.averageHeartRateBpm = value;
    }

    /**
     * Gets the value of the maximumHeartRateBpm property.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getMaximumHeartRateBpm() {
        return maximumHeartRateBpm;
    }

    /**
     * Sets the value of the maximumHeartRateBpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setMaximumHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.maximumHeartRateBpm = value;
    }

    /**
     * Gets the value of the intensity property.
     * 
     * @return
     *     possible object is
     *     {@link IntensityT }
     *     
     */
    public IntensityT getIntensity() {
        return intensity;
    }

    /**
     * Sets the value of the intensity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensityT }
     *     
     */
    public void setIntensity(IntensityT value) {
        this.intensity = value;
    }

    /**
     * Gets the value of the cadence property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCadence() {
        return cadence;
    }

    /**
     * Sets the value of the cadence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCadence(Short value) {
        this.cadence = value;
    }

    /**
     * Gets the value of the triggerMethod property.
     * 
     * @return
     *     possible object is
     *     {@link TriggerMethodT }
     *     
     */
    public TriggerMethodT getTriggerMethod() {
        return triggerMethod;
    }

    /**
     * Sets the value of the triggerMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerMethodT }
     *     
     */
    public void setTriggerMethod(TriggerMethodT value) {
        this.triggerMethod = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackT }
     * 
     * 
     */
    public List<TrackT> getTrack() {
        if (track == null) {
            track = new ArrayList<TrackT>();
        }
        return this.track;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

}
