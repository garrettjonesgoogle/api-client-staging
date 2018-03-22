<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/storage.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Options defining BigQuery table and row identifiers.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.BigQueryOptions</code>
 */
class BigQueryOptions extends \Google\Protobuf\Internal\Message
{
    /**
     * Complete BigQuery table reference.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     */
    private $table_reference = null;
    /**
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 2;</code>
     */
    private $identifying_fields;

    public function __construct() {
        \GPBMetadata\Google\Privacy\Dlp\V2\Storage::initOnce();
        parent::__construct();
    }

    /**
     * Complete BigQuery table reference.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     * @return \Google\Cloud\Dlp\V2\BigQueryTable
     */
    public function getTableReference()
    {
        return $this->table_reference;
    }

    /**
     * Complete BigQuery table reference.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.BigQueryTable table_reference = 1;</code>
     * @param \Google\Cloud\Dlp\V2\BigQueryTable $var
     * @return $this
     */
    public function setTableReference($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\BigQueryTable::class);
        $this->table_reference = $var;

        return $this;
    }

    /**
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 2;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getIdentifyingFields()
    {
        return $this->identifying_fields;
    }

    /**
     * References to fields uniquely identifying rows within the table.
     * Nested fields in the format, like `person.birthdate.year`, are allowed.
     *
     * Generated from protobuf field <code>repeated .google.privacy.dlp.v2.FieldId identifying_fields = 2;</code>
     * @param \Google\Cloud\Dlp\V2\FieldId[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setIdentifyingFields($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Cloud\Dlp\V2\FieldId::class);
        $this->identifying_fields = $arr;

        return $this;
    }

}
