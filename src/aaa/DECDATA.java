//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.02.18 时间 02:51:48 PM CST 
//


package aaa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DEC_HEAD">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DEC_MOD_SEQNO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PRE_ENTRY_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ENTRY_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ENTRY_TYPE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="I_E_FLAG">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DECL_PORT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="I_E_PORT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="I_E_DATE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="D_DATE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DESTINATION_PORT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRAF_MODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRAF_NAME">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="VOYAGE_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BILL_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRADE_CO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRADE_NAME">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CO_OWNER">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OWNER_CODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OWNER_NAME">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DISTRICT_CODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AGENT_CODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="AGENT_NAME">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="70"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CONTR_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="IN_RATIO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRADE_COUNTRY">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRADE_MODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CUT_MODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRANS_MODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CONTAINER_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="5"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PAY_WAY">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FEE_MARK">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FEE_CURR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="FEE_RATE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INSUR_MARK">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INSUR_CURR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="INSUR_RATE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OTHER_MARK">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OTHER_CURR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="OTHER_RATE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PACK_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="9"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GROSS_WT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NET_WT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="WRAP_TYPE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="LICENSE_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="APPR_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="MANUAL_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RELATIVE_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="18"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RELATIVE_MANUAL_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BONDED_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CUSTOMS_FIELD">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="P_DATE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="8"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TYPIST_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DECLARE_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="13"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="BP_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NOTE_S">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DEC_LIST" maxOccurs="20" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="G_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="9"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CODE_TS">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="G_NAME">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="G_MODEL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="50"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ORIGIN_COUNTRY">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CONTR_ITEM">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="9"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="G_QTY">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="G_UNIT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="QTY_1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UNIT_1">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="QTY_2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UNIT_2">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="TRADE_CURR">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DECL_PRICE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DECL_TOTAL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="19"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="USE_TO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="DUTY_MODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="WORK_USD">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="19"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="PRDT_NO">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="GOODS_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DEC_CONTAINER" maxOccurs="500" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CONTAINER_ID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CONTAINER_WT">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DEC_CERTIFICATE" maxOccurs="7" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DOCU_CODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CERT_CODE">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="32"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dechead",
    "declist",
    "deccontainer",
    "deccertificate"
})
@XmlRootElement(name = "DEC_DATA")
public class DECDATA {

    @XmlElement(name = "DEC_HEAD", required = true)
    protected DECDATA.DECHEAD dechead;
    @XmlElement(name = "DEC_LIST")
    protected List<DECDATA.DECLIST> declist;
    @XmlElement(name = "DEC_CONTAINER")
    protected List<DECDATA.DECCONTAINER> deccontainer;
    @XmlElement(name = "DEC_CERTIFICATE")
    protected List<DECDATA.DECCERTIFICATE> deccertificate;

    /**
     * 获取dechead属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DECDATA.DECHEAD }
     *     
     */
    public DECDATA.DECHEAD getDECHEAD() {
        return dechead;
    }

    /**
     * 设置dechead属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DECDATA.DECHEAD }
     *     
     */
    public void setDECHEAD(DECDATA.DECHEAD value) {
        this.dechead = value;
    }

    /**
     * Gets the value of the declist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDECLIST().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DECDATA.DECLIST }
     * 
     * 
     */
    public List<DECDATA.DECLIST> getDECLIST() {
        if (declist == null) {
            declist = new ArrayList<DECDATA.DECLIST>();
        }
        return this.declist;
    }

    /**
     * Gets the value of the deccontainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deccontainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDECCONTAINER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DECDATA.DECCONTAINER }
     * 
     * 
     */
    public List<DECDATA.DECCONTAINER> getDECCONTAINER() {
        if (deccontainer == null) {
            deccontainer = new ArrayList<DECDATA.DECCONTAINER>();
        }
        return this.deccontainer;
    }

    /**
     * Gets the value of the deccertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deccertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDECCERTIFICATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DECDATA.DECCERTIFICATE }
     * 
     * 
     */
    public List<DECDATA.DECCERTIFICATE> getDECCERTIFICATE() {
        if (deccertificate == null) {
            deccertificate = new ArrayList<DECDATA.DECCERTIFICATE>();
        }
        return this.deccertificate;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DOCU_CODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CERT_CODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "docucode",
        "certcode"
    })
    public static class DECCERTIFICATE {

        @XmlElement(name = "DOCU_CODE", required = true)
        protected String docucode;
        @XmlElement(name = "CERT_CODE", required = true)
        protected String certcode;

        /**
         * 获取docucode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDOCUCODE() {
            return docucode;
        }

        /**
         * 设置docucode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDOCUCODE(String value) {
            this.docucode = value;
        }

        /**
         * 获取certcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCERTCODE() {
            return certcode;
        }

        /**
         * 设置certcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCERTCODE(String value) {
            this.certcode = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CONTAINER_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CONTAINER_WT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "containerid",
        "containerwt"
    })
    public static class DECCONTAINER {

        @XmlElement(name = "CONTAINER_ID", required = true)
        protected String containerid;
        @XmlElement(name = "CONTAINER_WT", required = true)
        protected String containerwt;

        /**
         * 获取containerid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTAINERID() {
            return containerid;
        }

        /**
         * 设置containerid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTAINERID(String value) {
            this.containerid = value;
        }

        /**
         * 获取containerwt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTAINERWT() {
            return containerwt;
        }

        /**
         * 设置containerwt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTAINERWT(String value) {
            this.containerwt = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="DEC_MOD_SEQNO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PRE_ENTRY_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ENTRY_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ENTRY_TYPE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="I_E_FLAG">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DECL_PORT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="I_E_PORT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="I_E_DATE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="D_DATE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DESTINATION_PORT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRAF_MODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRAF_NAME">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="VOYAGE_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BILL_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRADE_CO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRADE_NAME">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CO_OWNER">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OWNER_CODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OWNER_NAME">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DISTRICT_CODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AGENT_CODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="AGENT_NAME">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="70"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CONTR_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="IN_RATIO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRADE_COUNTRY">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRADE_MODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CUT_MODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRANS_MODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CONTAINER_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="5"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PAY_WAY">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FEE_MARK">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FEE_CURR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="FEE_RATE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INSUR_MARK">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INSUR_CURR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="INSUR_RATE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OTHER_MARK">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OTHER_CURR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="OTHER_RATE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PACK_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="9"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GROSS_WT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NET_WT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="WRAP_TYPE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="LICENSE_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="APPR_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="MANUAL_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RELATIVE_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="18"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RELATIVE_MANUAL_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BONDED_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CUSTOMS_FIELD">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="P_DATE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="8"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TYPIST_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DECLARE_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="13"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="BP_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NOTE_S">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "decmodseqno",
        "preentryid",
        "entryid",
        "entrytype",
        "ieflag",
        "declport",
        "ieport",
        "iedate",
        "ddate",
        "destinationport",
        "trafmode",
        "trafname",
        "voyageno",
        "billno",
        "tradeco",
        "tradename",
        "coowner",
        "ownercode",
        "ownername",
        "districtcode",
        "agentcode",
        "agentname",
        "contrno",
        "inratio",
        "tradecountry",
        "trademode",
        "cutmode",
        "transmode",
        "containerno",
        "payway",
        "feemark",
        "feecurr",
        "feerate",
        "insurmark",
        "insurcurr",
        "insurrate",
        "othermark",
        "othercurr",
        "otherrate",
        "packno",
        "grosswt",
        "netwt",
        "wraptype",
        "licenseno",
        "apprno",
        "manualno",
        "relativeid",
        "relativemanualno",
        "bondedno",
        "customsfield",
        "pdate",
        "typistno",
        "declareno",
        "bpno",
        "notes"
    })
    public static class DECHEAD {

        @XmlElement(name = "DEC_MOD_SEQNO", required = true)
        protected String decmodseqno;
        @XmlElement(name = "PRE_ENTRY_ID", required = true)
        protected String preentryid;
        @XmlElement(name = "ENTRY_ID", required = true)
        protected String entryid;
        @XmlElement(name = "ENTRY_TYPE", required = true)
        protected String entrytype;
        @XmlElement(name = "I_E_FLAG", required = true)
        protected String ieflag;
        @XmlElement(name = "DECL_PORT", required = true)
        protected String declport;
        @XmlElement(name = "I_E_PORT", required = true)
        protected String ieport;
        @XmlElement(name = "I_E_DATE", required = true)
        protected String iedate;
        @XmlElement(name = "D_DATE", required = true)
        protected String ddate;
        @XmlElement(name = "DESTINATION_PORT", required = true)
        protected String destinationport;
        @XmlElement(name = "TRAF_MODE", required = true)
        protected String trafmode;
        @XmlElement(name = "TRAF_NAME", required = true)
        protected String trafname;
        @XmlElement(name = "VOYAGE_NO", required = true)
        protected String voyageno;
        @XmlElement(name = "BILL_NO", required = true)
        protected String billno;
        @XmlElement(name = "TRADE_CO", required = true)
        protected String tradeco;
        @XmlElement(name = "TRADE_NAME", required = true)
        protected String tradename;
        @XmlElement(name = "CO_OWNER", required = true)
        protected String coowner;
        @XmlElement(name = "OWNER_CODE", required = true)
        protected String ownercode;
        @XmlElement(name = "OWNER_NAME", required = true)
        protected String ownername;
        @XmlElement(name = "DISTRICT_CODE", required = true)
        protected String districtcode;
        @XmlElement(name = "AGENT_CODE", required = true)
        protected String agentcode;
        @XmlElement(name = "AGENT_NAME", required = true)
        protected String agentname;
        @XmlElement(name = "CONTR_NO", required = true)
        protected String contrno;
        @XmlElement(name = "IN_RATIO", required = true)
        protected String inratio;
        @XmlElement(name = "TRADE_COUNTRY", required = true)
        protected String tradecountry;
        @XmlElement(name = "TRADE_MODE", required = true)
        protected String trademode;
        @XmlElement(name = "CUT_MODE", required = true)
        protected String cutmode;
        @XmlElement(name = "TRANS_MODE", required = true)
        protected String transmode;
        @XmlElement(name = "CONTAINER_NO", required = true)
        protected String containerno;
        @XmlElement(name = "PAY_WAY", required = true)
        protected String payway;
        @XmlElement(name = "FEE_MARK", required = true)
        protected String feemark;
        @XmlElement(name = "FEE_CURR", required = true)
        protected String feecurr;
        @XmlElement(name = "FEE_RATE", required = true)
        protected String feerate;
        @XmlElement(name = "INSUR_MARK", required = true)
        protected String insurmark;
        @XmlElement(name = "INSUR_CURR", required = true)
        protected String insurcurr;
        @XmlElement(name = "INSUR_RATE", required = true)
        protected String insurrate;
        @XmlElement(name = "OTHER_MARK", required = true)
        protected String othermark;
        @XmlElement(name = "OTHER_CURR", required = true)
        protected String othercurr;
        @XmlElement(name = "OTHER_RATE", required = true)
        protected String otherrate;
        @XmlElement(name = "PACK_NO", required = true)
        protected String packno;
        @XmlElement(name = "GROSS_WT", required = true)
        protected String grosswt;
        @XmlElement(name = "NET_WT", required = true)
        protected String netwt;
        @XmlElement(name = "WRAP_TYPE", required = true)
        protected String wraptype;
        @XmlElement(name = "LICENSE_NO", required = true)
        protected String licenseno;
        @XmlElement(name = "APPR_NO", required = true)
        protected String apprno;
        @XmlElement(name = "MANUAL_NO", required = true)
        protected String manualno;
        @XmlElement(name = "RELATIVE_ID", required = true)
        protected String relativeid;
        @XmlElement(name = "RELATIVE_MANUAL_NO", required = true)
        protected String relativemanualno;
        @XmlElement(name = "BONDED_NO", required = true)
        protected String bondedno;
        @XmlElement(name = "CUSTOMS_FIELD", required = true)
        protected String customsfield;
        @XmlElement(name = "P_DATE", required = true)
        protected String pdate;
        @XmlElement(name = "TYPIST_NO", required = true)
        protected String typistno;
        @XmlElement(name = "DECLARE_NO", required = true)
        protected String declareno;
        @XmlElement(name = "BP_NO", required = true)
        protected String bpno;
        @XmlElement(name = "NOTE_S", required = true)
        protected String notes;

        /**
         * 获取decmodseqno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDECMODSEQNO() {
            return decmodseqno;
        }

        /**
         * 设置decmodseqno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDECMODSEQNO(String value) {
            this.decmodseqno = value;
        }

        /**
         * 获取preentryid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPREENTRYID() {
            return preentryid;
        }

        /**
         * 设置preentryid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPREENTRYID(String value) {
            this.preentryid = value;
        }

        /**
         * 获取entryid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENTRYID() {
            return entryid;
        }

        /**
         * 设置entryid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENTRYID(String value) {
            this.entryid = value;
        }

        /**
         * 获取entrytype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getENTRYTYPE() {
            return entrytype;
        }

        /**
         * 设置entrytype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setENTRYTYPE(String value) {
            this.entrytype = value;
        }

        /**
         * 获取ieflag属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIEFLAG() {
            return ieflag;
        }

        /**
         * 设置ieflag属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIEFLAG(String value) {
            this.ieflag = value;
        }

        /**
         * 获取declport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDECLPORT() {
            return declport;
        }

        /**
         * 设置declport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDECLPORT(String value) {
            this.declport = value;
        }

        /**
         * 获取ieport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIEPORT() {
            return ieport;
        }

        /**
         * 设置ieport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIEPORT(String value) {
            this.ieport = value;
        }

        /**
         * 获取iedate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIEDATE() {
            return iedate;
        }

        /**
         * 设置iedate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIEDATE(String value) {
            this.iedate = value;
        }

        /**
         * 获取ddate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDDATE() {
            return ddate;
        }

        /**
         * 设置ddate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDDATE(String value) {
            this.ddate = value;
        }

        /**
         * 获取destinationport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDESTINATIONPORT() {
            return destinationport;
        }

        /**
         * 设置destinationport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDESTINATIONPORT(String value) {
            this.destinationport = value;
        }

        /**
         * 获取trafmode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAFMODE() {
            return trafmode;
        }

        /**
         * 设置trafmode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAFMODE(String value) {
            this.trafmode = value;
        }

        /**
         * 获取trafname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRAFNAME() {
            return trafname;
        }

        /**
         * 设置trafname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRAFNAME(String value) {
            this.trafname = value;
        }

        /**
         * 获取voyageno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVOYAGENO() {
            return voyageno;
        }

        /**
         * 设置voyageno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVOYAGENO(String value) {
            this.voyageno = value;
        }

        /**
         * 获取billno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBILLNO() {
            return billno;
        }

        /**
         * 设置billno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBILLNO(String value) {
            this.billno = value;
        }

        /**
         * 获取tradeco属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADECO() {
            return tradeco;
        }

        /**
         * 设置tradeco属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADECO(String value) {
            this.tradeco = value;
        }

        /**
         * 获取tradename属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADENAME() {
            return tradename;
        }

        /**
         * 设置tradename属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADENAME(String value) {
            this.tradename = value;
        }

        /**
         * 获取coowner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOOWNER() {
            return coowner;
        }

        /**
         * 设置coowner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOOWNER(String value) {
            this.coowner = value;
        }

        /**
         * 获取ownercode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNERCODE() {
            return ownercode;
        }

        /**
         * 设置ownercode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNERCODE(String value) {
            this.ownercode = value;
        }

        /**
         * 获取ownername属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOWNERNAME() {
            return ownername;
        }

        /**
         * 设置ownername属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOWNERNAME(String value) {
            this.ownername = value;
        }

        /**
         * 获取districtcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDISTRICTCODE() {
            return districtcode;
        }

        /**
         * 设置districtcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDISTRICTCODE(String value) {
            this.districtcode = value;
        }

        /**
         * 获取agentcode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAGENTCODE() {
            return agentcode;
        }

        /**
         * 设置agentcode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAGENTCODE(String value) {
            this.agentcode = value;
        }

        /**
         * 获取agentname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAGENTNAME() {
            return agentname;
        }

        /**
         * 设置agentname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAGENTNAME(String value) {
            this.agentname = value;
        }

        /**
         * 获取contrno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTRNO() {
            return contrno;
        }

        /**
         * 设置contrno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTRNO(String value) {
            this.contrno = value;
        }

        /**
         * 获取inratio属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINRATIO() {
            return inratio;
        }

        /**
         * 设置inratio属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINRATIO(String value) {
            this.inratio = value;
        }

        /**
         * 获取tradecountry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADECOUNTRY() {
            return tradecountry;
        }

        /**
         * 设置tradecountry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADECOUNTRY(String value) {
            this.tradecountry = value;
        }

        /**
         * 获取trademode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADEMODE() {
            return trademode;
        }

        /**
         * 设置trademode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADEMODE(String value) {
            this.trademode = value;
        }

        /**
         * 获取cutmode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUTMODE() {
            return cutmode;
        }

        /**
         * 设置cutmode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUTMODE(String value) {
            this.cutmode = value;
        }

        /**
         * 获取transmode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRANSMODE() {
            return transmode;
        }

        /**
         * 设置transmode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRANSMODE(String value) {
            this.transmode = value;
        }

        /**
         * 获取containerno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTAINERNO() {
            return containerno;
        }

        /**
         * 设置containerno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTAINERNO(String value) {
            this.containerno = value;
        }

        /**
         * 获取payway属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPAYWAY() {
            return payway;
        }

        /**
         * 设置payway属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPAYWAY(String value) {
            this.payway = value;
        }

        /**
         * 获取feemark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFEEMARK() {
            return feemark;
        }

        /**
         * 设置feemark属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFEEMARK(String value) {
            this.feemark = value;
        }

        /**
         * 获取feecurr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFEECURR() {
            return feecurr;
        }

        /**
         * 设置feecurr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFEECURR(String value) {
            this.feecurr = value;
        }

        /**
         * 获取feerate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFEERATE() {
            return feerate;
        }

        /**
         * 设置feerate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFEERATE(String value) {
            this.feerate = value;
        }

        /**
         * 获取insurmark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSURMARK() {
            return insurmark;
        }

        /**
         * 设置insurmark属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSURMARK(String value) {
            this.insurmark = value;
        }

        /**
         * 获取insurcurr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSURCURR() {
            return insurcurr;
        }

        /**
         * 设置insurcurr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSURCURR(String value) {
            this.insurcurr = value;
        }

        /**
         * 获取insurrate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getINSURRATE() {
            return insurrate;
        }

        /**
         * 设置insurrate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setINSURRATE(String value) {
            this.insurrate = value;
        }

        /**
         * 获取othermark属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERMARK() {
            return othermark;
        }

        /**
         * 设置othermark属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERMARK(String value) {
            this.othermark = value;
        }

        /**
         * 获取othercurr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERCURR() {
            return othercurr;
        }

        /**
         * 设置othercurr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERCURR(String value) {
            this.othercurr = value;
        }

        /**
         * 获取otherrate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOTHERRATE() {
            return otherrate;
        }

        /**
         * 设置otherrate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOTHERRATE(String value) {
            this.otherrate = value;
        }

        /**
         * 获取packno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPACKNO() {
            return packno;
        }

        /**
         * 设置packno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPACKNO(String value) {
            this.packno = value;
        }

        /**
         * 获取grosswt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGROSSWT() {
            return grosswt;
        }

        /**
         * 设置grosswt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGROSSWT(String value) {
            this.grosswt = value;
        }

        /**
         * 获取netwt属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNETWT() {
            return netwt;
        }

        /**
         * 设置netwt属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNETWT(String value) {
            this.netwt = value;
        }

        /**
         * 获取wraptype属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWRAPTYPE() {
            return wraptype;
        }

        /**
         * 设置wraptype属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWRAPTYPE(String value) {
            this.wraptype = value;
        }

        /**
         * 获取licenseno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLICENSENO() {
            return licenseno;
        }

        /**
         * 设置licenseno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLICENSENO(String value) {
            this.licenseno = value;
        }

        /**
         * 获取apprno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAPPRNO() {
            return apprno;
        }

        /**
         * 设置apprno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAPPRNO(String value) {
            this.apprno = value;
        }

        /**
         * 获取manualno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMANUALNO() {
            return manualno;
        }

        /**
         * 设置manualno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMANUALNO(String value) {
            this.manualno = value;
        }

        /**
         * 获取relativeid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIVEID() {
            return relativeid;
        }

        /**
         * 设置relativeid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIVEID(String value) {
            this.relativeid = value;
        }

        /**
         * 获取relativemanualno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRELATIVEMANUALNO() {
            return relativemanualno;
        }

        /**
         * 设置relativemanualno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRELATIVEMANUALNO(String value) {
            this.relativemanualno = value;
        }

        /**
         * 获取bondedno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBONDEDNO() {
            return bondedno;
        }

        /**
         * 设置bondedno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBONDEDNO(String value) {
            this.bondedno = value;
        }

        /**
         * 获取customsfield属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCUSTOMSFIELD() {
            return customsfield;
        }

        /**
         * 设置customsfield属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCUSTOMSFIELD(String value) {
            this.customsfield = value;
        }

        /**
         * 获取pdate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPDATE() {
            return pdate;
        }

        /**
         * 设置pdate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPDATE(String value) {
            this.pdate = value;
        }

        /**
         * 获取typistno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTYPISTNO() {
            return typistno;
        }

        /**
         * 设置typistno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTYPISTNO(String value) {
            this.typistno = value;
        }

        /**
         * 获取declareno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDECLARENO() {
            return declareno;
        }

        /**
         * 设置declareno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDECLARENO(String value) {
            this.declareno = value;
        }

        /**
         * 获取bpno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBPNO() {
            return bpno;
        }

        /**
         * 设置bpno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBPNO(String value) {
            this.bpno = value;
        }

        /**
         * 获取notes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOTES() {
            return notes;
        }

        /**
         * 设置notes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOTES(String value) {
            this.notes = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="G_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="9"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CODE_TS">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="G_NAME">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="G_MODEL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="50"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ORIGIN_COUNTRY">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CONTR_ITEM">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="9"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="G_QTY">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="G_UNIT">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="QTY_1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UNIT_1">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="QTY_2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UNIT_2">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="TRADE_CURR">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DECL_PRICE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DECL_TOTAL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="19"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="USE_TO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="DUTY_MODE">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="WORK_USD">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="19"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="PRDT_NO">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="GOODS_ID">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="32"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gno",
        "codets",
        "gname",
        "gmodel",
        "origincountry",
        "contritem",
        "gqty",
        "gunit",
        "qty1",
        "unit1",
        "qty2",
        "unit2",
        "tradecurr",
        "declprice",
        "decltotal",
        "useto",
        "dutymode",
        "workusd",
        "prdtno",
        "goodsid"
    })
    public static class DECLIST {

        @XmlElement(name = "G_NO", required = true)
        protected String gno;
        @XmlElement(name = "CODE_TS", required = true)
        protected String codets;
        @XmlElement(name = "G_NAME", required = true)
        protected String gname;
        @XmlElement(name = "G_MODEL", required = true)
        protected String gmodel;
        @XmlElement(name = "ORIGIN_COUNTRY", required = true)
        protected String origincountry;
        @XmlElement(name = "CONTR_ITEM", required = true)
        protected String contritem;
        @XmlElement(name = "G_QTY", required = true)
        protected String gqty;
        @XmlElement(name = "G_UNIT", required = true)
        protected String gunit;
        @XmlElement(name = "QTY_1", required = true)
        protected String qty1;
        @XmlElement(name = "UNIT_1", required = true)
        protected String unit1;
        @XmlElement(name = "QTY_2", required = true)
        protected String qty2;
        @XmlElement(name = "UNIT_2", required = true)
        protected String unit2;
        @XmlElement(name = "TRADE_CURR", required = true)
        protected String tradecurr;
        @XmlElement(name = "DECL_PRICE", required = true)
        protected String declprice;
        @XmlElement(name = "DECL_TOTAL", required = true)
        protected String decltotal;
        @XmlElement(name = "USE_TO", required = true)
        protected String useto;
        @XmlElement(name = "DUTY_MODE", required = true)
        protected String dutymode;
        @XmlElement(name = "WORK_USD", required = true)
        protected String workusd;
        @XmlElement(name = "PRDT_NO", required = true)
        protected String prdtno;
        @XmlElement(name = "GOODS_ID", required = true)
        protected String goodsid;

        /**
         * 获取gno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGNO() {
            return gno;
        }

        /**
         * 设置gno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGNO(String value) {
            this.gno = value;
        }

        /**
         * 获取codets属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCODETS() {
            return codets;
        }

        /**
         * 设置codets属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCODETS(String value) {
            this.codets = value;
        }

        /**
         * 获取gname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGNAME() {
            return gname;
        }

        /**
         * 设置gname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGNAME(String value) {
            this.gname = value;
        }

        /**
         * 获取gmodel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGMODEL() {
            return gmodel;
        }

        /**
         * 设置gmodel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGMODEL(String value) {
            this.gmodel = value;
        }

        /**
         * 获取origincountry属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getORIGINCOUNTRY() {
            return origincountry;
        }

        /**
         * 设置origincountry属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setORIGINCOUNTRY(String value) {
            this.origincountry = value;
        }

        /**
         * 获取contritem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCONTRITEM() {
            return contritem;
        }

        /**
         * 设置contritem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCONTRITEM(String value) {
            this.contritem = value;
        }

        /**
         * 获取gqty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGQTY() {
            return gqty;
        }

        /**
         * 设置gqty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGQTY(String value) {
            this.gqty = value;
        }

        /**
         * 获取gunit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUNIT() {
            return gunit;
        }

        /**
         * 设置gunit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUNIT(String value) {
            this.gunit = value;
        }

        /**
         * 获取qty1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQTY1() {
            return qty1;
        }

        /**
         * 设置qty1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQTY1(String value) {
            this.qty1 = value;
        }

        /**
         * 获取unit1属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIT1() {
            return unit1;
        }

        /**
         * 设置unit1属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIT1(String value) {
            this.unit1 = value;
        }

        /**
         * 获取qty2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQTY2() {
            return qty2;
        }

        /**
         * 设置qty2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQTY2(String value) {
            this.qty2 = value;
        }

        /**
         * 获取unit2属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUNIT2() {
            return unit2;
        }

        /**
         * 设置unit2属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUNIT2(String value) {
            this.unit2 = value;
        }

        /**
         * 获取tradecurr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTRADECURR() {
            return tradecurr;
        }

        /**
         * 设置tradecurr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTRADECURR(String value) {
            this.tradecurr = value;
        }

        /**
         * 获取declprice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDECLPRICE() {
            return declprice;
        }

        /**
         * 设置declprice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDECLPRICE(String value) {
            this.declprice = value;
        }

        /**
         * 获取decltotal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDECLTOTAL() {
            return decltotal;
        }

        /**
         * 设置decltotal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDECLTOTAL(String value) {
            this.decltotal = value;
        }

        /**
         * 获取useto属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUSETO() {
            return useto;
        }

        /**
         * 设置useto属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUSETO(String value) {
            this.useto = value;
        }

        /**
         * 获取dutymode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDUTYMODE() {
            return dutymode;
        }

        /**
         * 设置dutymode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDUTYMODE(String value) {
            this.dutymode = value;
        }

        /**
         * 获取workusd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWORKUSD() {
            return workusd;
        }

        /**
         * 设置workusd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWORKUSD(String value) {
            this.workusd = value;
        }

        /**
         * 获取prdtno属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPRDTNO() {
            return prdtno;
        }

        /**
         * 设置prdtno属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPRDTNO(String value) {
            this.prdtno = value;
        }

        /**
         * 获取goodsid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGOODSID() {
            return goodsid;
        }

        /**
         * 设置goodsid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGOODSID(String value) {
            this.goodsid = value;
        }

    }

}
