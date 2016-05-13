/*
 * Copyright (c) 2016 Memorial Sloan-Kettering Cancer Center.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF MERCHANTABILITY OR FITNESS
 * FOR A PARTICULAR PURPOSE. The software and documentation provided hereunder
 * is on an "as is" basis, and Memorial Sloan-Kettering Cancer Center has no
 * obligations to provide maintenance, support, updates, enhancements or
 * modifications. In no event shall Memorial Sloan-Kettering Cancer Center be
 * liable to any party for direct, indirect, special, incidental or
 * consequential damages, including lost profits, arising out of the use of this
 * software and its documentation, even if Memorial Sloan-Kettering Cancer
 * Center has been advised of the possibility of such damage.
 */

/*
 * This file is part of cBioPortal Cancer Hotspots.
 *
 * cBioPortal is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package org.cmo.cancerhotspots.domain;

import com.univocity.parsers.annotations.Convert;
import com.univocity.parsers.annotations.Parsed;
import com.univocity.parsers.annotations.Trim;
import io.swagger.annotations.ApiModelProperty;

import java.util.Map;

/**
 * @author Selcuk Onur Sumer
 */
public class HotspotMutation
{
    @Trim
    @Parsed(field = "Hugo Symbol")
    private String hugoSymbol;

    @Trim
    @Parsed(field = "Codon")
    private String codon;

    @Trim
    @Parsed(field = "Alt Common Codon Usage *")
    private String altCommonCodonUsage;

    @Trim
    @Convert(conversionClass = MapConversion.class)
    @Parsed(field = "Variant Amino Acid")
    private Map<String, Integer> variantAminoAcid;

    @Trim
    @Parsed(field = "Q-value")
    private String qValue;

    @Trim
    @Parsed(field = "P-value")
    private String pValue;

    @Trim
    @Parsed(field = "Tumor Count")
    private Integer tumorCount;

    @Trim
    @Parsed(field = "Tumor Type Count")
    private Integer tumorTypeCount;

    @Trim
    @Parsed(field = "Validation Level [a]")
    private String validationLevel;

    @Trim
    @Convert(conversionClass = MapConversion.class)
    @Parsed(field = "Tumor Type Composition")
    private Map<String, Integer> tumorTypeComposition;


    @ApiModelProperty(value = "Hugo symbol", required = true)
    public String getHugoSymbol()
    {
        return hugoSymbol;
    }

    public void setHugoSymbol(String hugoSymbol)
    {
        this.hugoSymbol = hugoSymbol;
    }

    @ApiModelProperty(value = "Codon", required = true)
    public String getCodon()
    {
        return codon;
    }

    public void setCodon(String codon)
    {
        this.codon = codon;
    }

    @ApiModelProperty(value = "Alternative Common Codon Usage", required = true)
    public String getAltCommonCodonUsage()
    {
        return altCommonCodonUsage;
    }

    public void setAltCommonCodonUsage(String altCommonCodonUsage)
    {
        this.altCommonCodonUsage = altCommonCodonUsage;
    }

    @ApiModelProperty(value = "Variant Amino Acid", required = true)
    public Map<String, Integer> getVariantAminoAcid()
    {
        return variantAminoAcid;
    }

    public void setVariantAminoAcid(Map<String, Integer> variantAminoAcid)
    {
        this.variantAminoAcid = variantAminoAcid;
    }

    @ApiModelProperty(value = "Q-value", required = false)
    public String getqValue()
    {
        return qValue;
    }

    public void setqValue(String qValue)
    {
        this.qValue = qValue;
    }

    @ApiModelProperty(value = "P-value", required = false)
    public String getpValue()
    {
        return pValue;
    }

    public void setpValue(String pValue)
    {
        this.pValue = pValue;
    }

    @ApiModelProperty(value = "Number of Tumors", required = true)
    public Integer getTumorCount()
    {
        return tumorCount;
    }

    public void setTumorCount(Integer tumorCount)
    {
        this.tumorCount = tumorCount;
    }

    @ApiModelProperty(value = "Number of Distinct Tumor Types", required = false)
    public Integer getTumorTypeCount()
    {
        return tumorTypeCount;
    }

    public void setTumorTypeCount(Integer tumorTypeCount)
    {
        this.tumorTypeCount = tumorTypeCount;
    }

    @ApiModelProperty(value = "Validation Level", required = true)
    public String getValidationLevel()
    {
        return validationLevel;
    }

    public void setValidationLevel(String validationLevel)
    {
        this.validationLevel = validationLevel;
    }

    @ApiModelProperty(value = "Tumor Type Composition", required = true)
    public Map<String, Integer> getTumorTypeComposition()
    {
        return tumorTypeComposition;
    }

    public void setTumorTypeComposition(Map<String, Integer> tumorTypeComposition)
    {
        this.tumorTypeComposition = tumorTypeComposition;
    }
}
