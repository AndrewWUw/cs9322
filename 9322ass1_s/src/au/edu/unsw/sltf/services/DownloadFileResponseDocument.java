/*
 * An XML document type.
 * Localname: downloadFileResponse
 * Namespace: http://sltf.unsw.edu.au/services
 * Java type: au.edu.unsw.sltf.services.DownloadFileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package au.edu.unsw.sltf.services;


/**
 * A document containing one downloadFileResponse(@http://sltf.unsw.edu.au/services) element.
 *
 * This is a complex type.
 */
public interface DownloadFileResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DownloadFileResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E68FC4DE194836EF5928CD8C66708EA").resolveHandle("downloadfileresponse45a3doctype");
    
    /**
     * Gets the "downloadFileResponse" element
     */
    au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse getDownloadFileResponse();
    
    /**
     * Sets the "downloadFileResponse" element
     */
    void setDownloadFileResponse(au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse downloadFileResponse);
    
    /**
     * Appends and returns a new empty "downloadFileResponse" element
     */
    au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse addNewDownloadFileResponse();
    
    /**
     * An XML downloadFileResponse(@http://sltf.unsw.edu.au/services).
     *
     * This is a complex type.
     */
    public interface DownloadFileResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DownloadFileResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3E68FC4DE194836EF5928CD8C66708EA").resolveHandle("downloadfileresponsefdc4elemtype");
        
        /**
         * Gets the "dataURL" element
         */
        java.lang.String getDataURL();
        
        /**
         * Gets (as xml) the "dataURL" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetDataURL();
        
        /**
         * Sets the "dataURL" element
         */
        void setDataURL(java.lang.String dataURL);
        
        /**
         * Sets (as xml) the "dataURL" element
         */
        void xsetDataURL(org.apache.xmlbeans.XmlAnyURI dataURL);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse newInstance() {
              return (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (au.edu.unsw.sltf.services.DownloadFileResponseDocument.DownloadFileResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument newInstance() {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static au.edu.unsw.sltf.services.DownloadFileResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (au.edu.unsw.sltf.services.DownloadFileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
