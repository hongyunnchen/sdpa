package org.openflow.protocol.statistics;

import java.nio.ByteBuffer;

import org.openflow.util.StringByteSerializer;

/**
 * Represents an ofp_desc_stats structure
 * @author David Erickson (daviderickson@cs.stanford.edu)
 */
public class OFDescriptionStatistics implements OFStatistics {
    public static int DESCRIPTION_STRING_LENGTH = 256;
    public static int SERIAL_NUMBER_LENGTH = 32;
    public static int MINIMUM_LENGTH = 1056;

    protected String manufacturerDescription;
    protected String hardwareDescription;
    protected String softwareDescription;
    protected String serialNumber;
    protected String datapathDescription;

    /**
     *
     */
    public OFDescriptionStatistics() {
    }

    /**
     * Copy constructor
     */
	public OFDescriptionStatistics(OFDescriptionStatistics other) {
    	manufacturerDescription = other.manufacturerDescription;
       	hardwareDescription = other.hardwareDescription;
       	softwareDescription = other.softwareDescription;
       	serialNumber = other.serialNumber;
    	datapathDescription = other.datapathDescription;
    }
    
    /**
     * @return the manufacturerDescription
     */
    public String getManufacturerDescription() {
        return manufacturerDescription;
    }

    /**
     * @param manufacturerDescription the manufacturerDescription to set
     */
    public OFDescriptionStatistics setManufacturerDescription(String manufacturerDescription) {
        this.manufacturerDescription = manufacturerDescription;
        return this;
    }

    /**
     * @return the hardwareDescription
     */
    public String getHardwareDescription() {
        return hardwareDescription;
    }

    /**
     * @param hardwareDescription the hardwareDescription to set
     */
    public OFDescriptionStatistics setHardwareDescription(String hardwareDescription) {
        this.hardwareDescription = hardwareDescription;
        return this;
    }

    /**
     * @return the softwareDescription
     */
    public String getSoftwareDescription() {
        return softwareDescription;
    }

    /**
     * @param softwareDescription the softwareDescription to set
     */
    public OFDescriptionStatistics setSoftwareDescription(String softwareDescription) {
        this.softwareDescription = softwareDescription;
        return this;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public OFDescriptionStatistics setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }

    /**
     * @return the datapathDescription
     */
    public String getDatapathDescription() {
        return datapathDescription;
    }

    /**
     * @param datapathDescription the datapathDescription to set
     */
    public OFDescriptionStatistics setDatapathDescription(String datapathDescription) {
        this.datapathDescription = datapathDescription;
        return this;
    }

    @Override
    public int getLength() {
        return MINIMUM_LENGTH;
    }

    @Override
    public void readFrom(ByteBuffer data) {
        this.manufacturerDescription = StringByteSerializer.readFrom(data,
                DESCRIPTION_STRING_LENGTH);
        this.hardwareDescription = StringByteSerializer.readFrom(data,
                DESCRIPTION_STRING_LENGTH);
        this.softwareDescription = StringByteSerializer.readFrom(data,
                DESCRIPTION_STRING_LENGTH);
        this.serialNumber = StringByteSerializer.readFrom(data,
                SERIAL_NUMBER_LENGTH);
        this.datapathDescription = StringByteSerializer.readFrom(data,
                DESCRIPTION_STRING_LENGTH);
    }

    @Override
    public void writeTo(ByteBuffer data) {
        StringByteSerializer.writeTo(data, DESCRIPTION_STRING_LENGTH,
                this.manufacturerDescription);
        StringByteSerializer.writeTo(data, DESCRIPTION_STRING_LENGTH,
                this.hardwareDescription);
        StringByteSerializer.writeTo(data, DESCRIPTION_STRING_LENGTH,
                this.softwareDescription);
        StringByteSerializer.writeTo(data, SERIAL_NUMBER_LENGTH,
                this.serialNumber);
        StringByteSerializer.writeTo(data, DESCRIPTION_STRING_LENGTH,
                this.datapathDescription);
    }

    @Override
    public int hashCode() {
        final int prime = 409;
        int result = 1;
        result = prime
                * result
                + ((datapathDescription == null) ? 0 : datapathDescription
                        .hashCode());
        result = prime
                * result
                + ((hardwareDescription == null) ? 0 : hardwareDescription
                        .hashCode());
        result = prime
                * result
                + ((manufacturerDescription == null) ? 0
                        : manufacturerDescription.hashCode());
        result = prime * result
                + ((serialNumber == null) ? 0 : serialNumber.hashCode());
        result = prime
                * result
                + ((softwareDescription == null) ? 0 : softwareDescription
                        .hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof OFDescriptionStatistics)) {
            return false;
        }
        OFDescriptionStatistics other = (OFDescriptionStatistics) obj;
        if (datapathDescription == null) {
            if (other.datapathDescription != null) {
                return false;
            }
        } else if (!datapathDescription.equals(other.datapathDescription)) {
            return false;
        }
        if (hardwareDescription == null) {
            if (other.hardwareDescription != null) {
                return false;
            }
        } else if (!hardwareDescription.equals(other.hardwareDescription)) {
            return false;
        }
        if (manufacturerDescription == null) {
            if (other.manufacturerDescription != null) {
                return false;
            }
        } else if (!manufacturerDescription
                .equals(other.manufacturerDescription)) {
            return false;
        }
        if (serialNumber == null) {
            if (other.serialNumber != null) {
                return false;
            }
        } else if (!serialNumber.equals(other.serialNumber)) {
            return false;
        }
        if (softwareDescription == null) {
            if (other.softwareDescription != null) {
                return false;
            }
        } else if (!softwareDescription.equals(other.softwareDescription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "OFDescriptionStatistics [Vendor: " + manufacturerDescription
                + ", Model: " + hardwareDescription
                + ", Make: " + datapathDescription
                + ", Version: " + softwareDescription 
                + ", S/N: " + serialNumber + "]";
    }

    @Override
    public int computeLength() {
        return getLength();
    }
}
