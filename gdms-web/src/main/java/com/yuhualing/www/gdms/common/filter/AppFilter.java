package com.yuhualing.www.gdms.common.filter;

import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by macbook on 17/4/20.
 */
public class AppFilter extends OncePerRequestFilter {

    Logger logger = Logger.getLogger("trace");

    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        logger.trace("tracefilter");

        filterChain.doFilter(request, response);
    }

}
