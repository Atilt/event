/*
 * This file is part of event, licensed under the MIT License.
 *
 * Copyright (c) 2021-2023 Seiama
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.seiama.event;

import org.jetbrains.annotations.NotNull;

/**
 * A subscription to an event.
 *
 * @param <E> the event type
 * @since 1.0.0
 */
public interface EventSubscription<E> {
  /**
   * Gets the event type.
   *
   * @return the event type
   * @since 1.0.0
   */
  @NotNull Class<E> event();

  /**
   * Gets the configuration.
   *
   * @return the configuration
   * @since 1.0.0
   */
  @NotNull EventConfig config();

  /**
   * Gets the subscriber.
   *
   * @return the subscriber
   * @since 1.0.0
   */
  @NotNull EventSubscriber<? super E> subscriber();

  /**
   * Disposes this subscription.
   *
   * <p>The subscriber held by this subscription will no longer receive events.</p>
   *
   * @since 1.0.0
   */
  void dispose();
}
