/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.natural_language_understanding.v1.model;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.EmotionScores;
import com.ibm.watson.developer_cloud.natural_language_understanding.v1.model.FeatureSentimentResults;

import com.ibm.watson.developer_cloud.natural_language_understanding.v1.NaturalLanguageUnderstanding;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * The most important keywords in the content, organized by relevance.
 */
public class KeywordsResult extends GenericModel {

  /** Relevance score from 0 to 1. Higher values indicate greater relevance. */
  private Long relevance;
  /** The keyword text. */
  private String text;
  /** Emotion analysis results for the keyword, enabled with the \&quot;emotion\&quot; option. */
  private EmotionScores emotion;
  /** Sentiment analysis results for the keyword, enabled with the \&quot;sentiment\&quot; option. */
  private FeatureSentimentResults sentiment;

  /**
   * Instantiates a new `KeywordsResult`
   *
   * @param relevance Relevance score from 0 to 1. Higher values indicate greater relevance.
   * @param text The keyword text.
   * @param emotion Emotion analysis results for the keyword, enabled with the \&quot;emotion\&quot; option.
   * @param sentiment Sentiment analysis results for the keyword, enabled with the \&quot;sentiment\&quot; option.
   */
  public KeywordsResult(final Long relevance, final String text, final EmotionScores emotion, final FeatureSentimentResults sentiment) {
    this.relevance = relevance;
    this.text = text;
    this.emotion = emotion;
    this.sentiment = sentiment;
  }

  /**
   * Gets the relevance.
   *
   * @return the relevance
   */
  public Long getRelevance() {
    return relevance;
  }

  /**
   * Gets the text.
   *
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * Gets the emotion.
   *
   * @return the emotion
   */
  public EmotionScores getEmotion() {
    return emotion;
  }

  /**
   * Gets the sentiment.
   *
   * @return the sentiment
   */
  public FeatureSentimentResults getSentiment() {
    return sentiment;
  }

  /**
   * Sets the relevance.
   *
   * @param relevance the new relevance
   */
  public void setRelevance(final Long relevance) {
    this.relevance = relevance;
  }

  /**
   * Sets the text.
   *
   * @param text the new text
   */
  public void setText(final String text) {
    this.text = text;
  }

  /**
   * Sets the emotion.
   *
   * @param emotion the new emotion
   */
  public void setEmotion(final EmotionScores emotion) {
    this.emotion = emotion;
  }

  /**
   * Sets the sentiment.
   *
   * @param sentiment the new sentiment
   */
  public void setSentiment(final FeatureSentimentResults sentiment) {
    this.sentiment = sentiment;
  }

}
