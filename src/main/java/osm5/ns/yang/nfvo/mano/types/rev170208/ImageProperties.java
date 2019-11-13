/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm5
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package osm5.ns.yang.nfvo.mano.types.rev170208;
import java.lang.String;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping image-properties {
 *   leaf image {
 *     type string;
 *   }
 *   leaf image-checksum {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/image-properties</i>
 *
 */
public interface ImageProperties
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("image-properties");

    /**
     * Image name for the software image.If the image name is found within the VNF 
     * package it willbe uploaded to all VIM accounts during onboarding 
     * process.Otherwise, the image must be added to the VIM account withthe same name 
     * as entered here.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>image</code>, or <code>null</code> if not present
     */
    @Nullable
    String getImage();
    
    /**
     * Image md5sum for the software image.The md5sum, if provided, along with the 
     * image name uniquelyidentifies an image uploaded to the CAL.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>imageChecksum</code>, or <code>null</code> if not present
     */
    @Nullable
    String getImageChecksum();

}

